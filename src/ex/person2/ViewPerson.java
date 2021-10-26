package ex.person2;

import sample.enumsample.Gender;
import java.util.*;

class ViewPerson {
    public static void main(String[] args) {
        List<Person>personList = new ArrayList<>(30);
        Map<Birthplace, List<Person>> birthplaceListMap =  new HashMap<>();

        //人物追加
       personList.addAll(Arrays.asList(
               new Person("山田",Birthplace.TOKYO, Gender.MEN,26),
               new Person("飴村",Birthplace.TOKYO,Gender.MEN,35),
               new Person("神宮寺",Birthplace.TOKYO,Gender.MEN,42),
               new Person("白膠木",Birthplace.OSAKA,Gender.MEN,30),
               new Person("躑躅森",Birthplace.OSAKA,Gender.MEN,30),
               new Person("天谷奴",Birthplace.OSAKA,Gender.MEN,47),
               new Person("杉本",Birthplace.HOKKAIDO,Gender.MEN,28),
               new Person("白石",Birthplace.HOKKAIDO,Gender.MEN,25),
               new Person("土方",Birthplace.HOKKAIDO,Gender.MEN,33),
               new Person("東方天",Birthplace.FUKUOKA,Gender.WOMEN,30),
               new Person("勘解由小路",Birthplace.FUKUOKA,Gender.WOMEN,28),
               new Person("碧棺",Birthplace.FUKUOKA,Gender.WOMEN,23)
        ));
       //出身地ごとの分類
                for (Person person:personList) {
                    if (birthplaceListMap.containsKey(person.getBirthplace())) {
                        birthplaceListMap.get(person.getBirthplace()).add(person);
                    }else {
                        List<Person>list = new ArrayList<>();
                        list.add(person);
                        birthplaceListMap.put(person.getBirthplace(),list);
                    }
                }
                //分類できたか表示
                for (Map.Entry entry:birthplaceListMap.entrySet()) {
                    System.out.println(entry.getKey());
                    for (Person person:(List<Person>) entry.getValue()) {
                        System.out.println(person);
                    }
                }
        //平均年齢の算出
        double ageSum = 0;//年齢の合計
        double cnt = 0 ;//人数
        for (Map.Entry entry:birthplaceListMap.entrySet()) {
            System.out.print(((Birthplace)entry.getKey()).getName());
            ageSum = 0;//クリア
            cnt = 0;//クリア
            for (Person person:(List<Person>)entry.getValue()) {
                ageSum += person.getAge();
                cnt++;
            }
            System.out.println(String.format(":%.1f歳",ageSum / cnt));
        }

        //男女別平均年齢の算出
        double ageMenSum = 0,ageWomenSum = 0,menCnt = 0,womenCnt = 0;
        for (Map.Entry entry:birthplaceListMap.entrySet()) {
            System.out.println(((Birthplace)entry.getKey()).getName());
            for (Person person:(List<Person>)entry.getValue()) {
                ageMenSum = 0;
                ageWomenSum = 0;
                menCnt = 0;
                womenCnt = 0;
                if (person.getGender().equals(Gender.MEN)) {
                    ageMenSum += person.getAge();
                    menCnt++;
                } else {
                    ageWomenSum += person.getAge();
                    womenCnt++;
                }
                ageSum += person.getAge();
            }
            System.out.println(String.format("男性:%.1f歳",(ageMenSum / menCnt)));
            System.out.println(String.format("女性:%.1f歳",(ageWomenSum / womenCnt)));
        }
    }
}
