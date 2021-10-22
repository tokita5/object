package asobiba;

import sample.enumsample.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class KnightView {
    public static void main(String[] args) {
        List<Knight>knights = new ArrayList<>();
        knights.addAll(Arrays.asList(
           new Knight("アルトリア", Gender.WOMEN,22),
                new Knight("モードレッド",Gender.WOMEN,16),
                new Knight("ガウェイン",Gender.MEN,30),
                new Knight("トリスタン",Gender.MEN,34),
                new Knight("ランスロット",Gender.MEN,23)
        ));
        System.out.println("\n課題A");
        for (Knight knight:knights) {
            System.out.println(knight);
        }
        System.out.println("\n課題B");
        knights.sort(Comparator.comparing(Knight::getAge,Comparator.reverseOrder()));
        for (Knight knight:knights) {
            System.out.println(knight);
        }
        System.out.println("\n課題C");
        knights.sort(Comparator.comparing(Knight::getName));
        for (Knight knight:knights) {
            if (knight.getGender().equals(Gender.MEN)) {
                System.out.println(knight);
            }
        }
        System.out.println("\n課題D");
        int sumMen = 0,sumWomen = 0 ;
        double countMen = 0,countWomen = 0;

        for (Knight knight:knights) {
            if (knight.getGender().equals(Gender.MEN)) {
                countMen++;
                sumMen+=knight.getAge();
            }
        }
        String.format("男性の平均年齢:%.1f",sumMen/countMen);
        String.format("女性の平均年齢:%.1f",sumWomen/countWomen);


        List <Knight> menList = new ArrayList<>();
        List<Knight> womenList = new ArrayList<>();

        for (Knight knight:knights) {
            if (knight.getGender().equals(Gender.MEN)) {
                menList.add(knight);
            }else{
                womenList.add(knight);
            }
        }
        System.out.println("課題E");
        menList.sort(Comparator.comparing(Knight::getAge));
        womenList.sort(Comparator.comparing(Knight::getAge));
        System.out.println("男性の最年長:" + menList.get(menList.size() - 1));
        System.out.println("女性の最年長:" + womenList.get(menList.size() - 1));
    }
}
