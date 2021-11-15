package asobiba.StringPractis;

import java.util.Arrays;

class HairetuSample {
    public static void main(String[] args) {
        //配列の平均

        //宣言
        int[] array = {20,30,50,10,40};

        //合計を保存する変数の宣言
        int sum = 0;

        //平均を保存する変数の宣言
        double ave = 0;

        //反復処理をしながら合計を求める
        for (int i = 0; i < array.length; i++) {
            sum += array[1]; //合計に加算

        }
        //配列の内容を表示
        System.out.println(Arrays.toString(array));

        //平均を求める
        ave = (double) sum / array.length; //double型へキャストしないと整数になる

        //平均の表示
        System.out.println("平均:" + ave);

    }
}
