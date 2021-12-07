package ex.person2;

import sample.enumsample.Gender;

import java.lang.management.MemoryNotificationInfo;
import java.util.*;
import java.util.stream.Collectors;

class StreamPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(15);

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

        //streamの練習
        //年齢が35歳以上の人の名前だけを表示
        System.out.println("練習１");
        personList.stream()
                .filter(p -> p.getAge() >=35)
                .forEach(p -> System.out.println(p.getName()));

        //年齢が35歳未満の人を表示
        System.out.println("練習2");
        personList.stream()
                .filter(p -> p.getAge() <=35)
                .forEach(p -> System.out.println(p.getName()));

        //Personの中身を順次表示
        System.out.println("\n課題１");
        personList.stream()
                .forEach(System.out::println);

        //名前だけ表示
        System.out.println("\n課題２");
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        //男性のみ表示
        System.out.println("\n課題3");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        //女性のみの表示
        System.out.println("\n課題3-1");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);

        //年齢の降順に並べ替え
        System.out.println("\n課題４");
        personList.stream()
                .sorted((p1,p2)-> p2.getAge()- p1.getAge())
                .forEach(p -> System.out.println(p.getName()+""+p.getAge()));

        //年齢の昇順に並べ替え
        System.out.println("\n課題4－1");
        personList.stream()
                .sorted((p1,p2)->p1.getAge()-p2.getAge())
                .forEach(p-> System.out.println(p.getName()+""+p.getAge()));

        //男性のみ名前の昇順に並べ替え
        System.out.println("\n課題５");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);


        //名前リストを表示
        System.out.println("\n課題6");
        List<String> nameList = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        //性別でグルーピングしたMap＜Gender,Person＞を生成
        System.out.println("\n課題7");
        Map<Gender,List<Person>> map = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
                map.entrySet().stream()
                        .map(s -> s.getKey().getJpName()+":"+s.getValue())
                        .forEach(System.out::println);

         //男性で最年長の人を表示
        System.out.println("\n課題8");
        Optional<Person> person = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge));
        person.ifPresent(p -> System.out.println(p));

        //女性の最年少を表示
        System.out.println("\n課題9");
        Optional<Person> person1 = personList.stream()
                .filter(p ->p.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge));
        person1.ifPresent(p -> System.out.println(p));

        //女性の平均年齢を表示
        System.out.println("\n課題10");
        OptionalDouble womanAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)
                .average();
        womanAverageAge.ifPresent(p -> System.out.println("女性の平均年齢："+ p));

        //男性の平均年齢を表示
        System.out.println("\n課題11");
        OptionalDouble manAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)
                .average();
        manAverageAge.ifPresent(p -> System.out.println("男性の平均年齢："+ p));
    }
}