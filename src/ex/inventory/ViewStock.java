package ex.inventory;

import java.util.*;

//在庫表示
public class ViewStock {
    public static void main(String[] args) {
        List<PersonalComputer> PCList = new ArrayList<>();

        PCList.addAll(Arrays.asList(
                new PersonalComputer("やまだ",1,1,40000,64,"Windows10"),
                new PersonalComputer("いけだ",2,1,90000,64,"Windows11"),
                new PersonalComputer("いのうえ",3,1,80000,64,"Windows11"),
                new PersonalComputer("たむら",4,2,120000,32,"Mac"),
                new PersonalComputer("わだ",5,2,30000,32,"Windows10"),
                new PersonalComputer("くどう",6,2,150000,64,"Mac"),
                new PersonalComputer("さらど",7,3,40000,32,"Windows10"),
                new PersonalComputer("あいざわ",8,3,70000,32,"Mac")
        ));

        //保管倉庫ごとの在庫管理を抽出したいのでマップにする
        Map<Integer,ArrayList<Integer>> storagePriceMap = new HashMap<>();

        //key : StorageNo
        //value : Price

        for (PersonalComputer p : PCList) {
            int storageNo = p.getStorageNo();
            if (!storagePriceMap.containsKey(storageNo)) { //Mapの中に倉庫番号がkeyとして入っているかどうかの
                storagePriceMap.put(storageNo,new ArrayList<>());
            }
            storagePriceMap.get(storageNo).add(p.getPrice());
        }
        //storagePriceMapの中身を表示
        System.out.println("//storagePriceMapの中身チェック");
        for (Map.Entry entry: storagePriceMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("PC金額" + entry.getValue());
        }

        //保管倉庫ごとの在庫内容を抽出したものをMapにする
        Map<Integer,ArrayList<String>> osMap = new HashMap<>();
        for (PersonalComputer p : PCList) {
            int storageNo = p.getStorageNo();
            if (!osMap.containsKey(storageNo)) {
                osMap.put(storageNo, new ArrayList<>());
            }
            osMap.get(storageNo).add(p.getOS());
        }
        System.out.println("//何のOSかチェック");
        for (Map.Entry entry : osMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey());
            System.out.println("OS" + entry.getValue());
        }

            //倉庫ごとのPC合計金額を計算して表示
            System.out.println("//倉庫ごとの合計金額");
            for (Map.Entry entry : storagePriceMap.entrySet()) {
                double sum = 0; //合計を初期化
                for (Integer i : (List<Integer>) entry.getValue()) {
                    sum += i;
                }
                System.out.println("倉庫番号" + entry.getKey());
                System.out.println("合計金額" + sum + "円");
            }

            //合計台数を表示
            System.out.println("//倉庫ごとの合計台数を表示");
            for (Map.Entry entry : storagePriceMap.entrySet()) {
                int cnt = ((List)entry.getValue()).size(); //合計台数
                System.out.println("倉庫番号" + entry.getKey());
                System.out.println("合計台数" + cnt + "台");

            }
            //倉庫別に１台ごとの平均金額を表示
            System.out.println("//倉庫内の1台ごとの平均金額");
            for (Map.Entry entry : storagePriceMap.entrySet()) {
                double sum = 0;
                for (Integer i : (List<Integer>) entry.getValue()) {
                    sum += i;
                }
             //数を数える
                int cnt = ((List)entry.getValue()).size();

                //平均の変数に値を詰める
                double averagePrice = 0;
                averagePrice = sum/cnt;

                System.out.println("合計の台数" + entry.getKey());
                System.out.println("平均金額" + averagePrice + "円/台");
                }
            }
        }

