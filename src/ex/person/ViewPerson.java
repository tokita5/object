package ex.person;

import sample.enumsample.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ViewPerson {
    public static void main(String[] args) {
        List <Person> persons = new ArrayList<>();
        persons.addAll(Arrays.asList(
           new Person("しむら", Gender.MEN,28),
                new Person("すどう",Gender.WOMEN,34),
                new Person("そのだ",Gender.WOMEN,21),
                new Person("さの",Gender.MEN,42),
                new Person("せがわ",Gender.WOMEN,55)
        ));
        //初期の並び順
        System.out.println("課題1");
        for (Person person:persons) {
            System.out.println(person);
        }

        //降順出力(拡張forでもできる)
        System.out.println("\n課題2");
        persons.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));

        for (Person person:persons) {
            System.out.println(person);
        }

        //昇順出力
        System.out.println("\n課題3");
        persons.sort(Comparator.comparing(Person::getName));
        for (Person person:persons) {
            if (person.getGender().equals(Gender.MEN)){
                System.out.println(person);
            }
        }
        //男性と女性の平均年齢
        System.out.println("\n課題4");
        int sumMen = 0,sumWomen = 0;
        double countMen = 0,countWomen =0;
        for (Person person:persons) {
            if (person.getGender().equals(Gender.MEN)) {
                countMen++;
                sumMen+=person.getAge();
            }
        }
        System.out.println(String.format("男性の平均年齢:%.1f", sumMen / countMen));
        System.out.println(String.format("女性の平均年齢:%.1f", sumWomen / countWomen));


        //男性と女性の最長年齢
        List<Person> menList = new ArrayList<>();
        List<Person> womenList = new ArrayList<>();

        for (Person person:persons) {
            if (person.getGender().equals(Gender.MEN)) {
                menList.add(person);
            }else {
                womenList.add(person);
            }
        }
        System.out.println("\n課題5");
        menList.sort(Comparator.comparing(Person::getAge));
        womenList.sort(Comparator.comparing(Person::getAge));
        System.out.println("男性の最年長:" + menList.get(menList.size() - 1));
        System.out.println("女性の最年長:" + womenList.get(menList.size() - 1));
    }
    }