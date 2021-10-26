package sample;

import java.util.Arrays;

public class StringSample {
    public static void main(String[] args) {
        String word1 = "aaaa";
        //文字列の結合
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html
        System.out.println(word1.concat("bbb"));//aaaabbb

        //文字列の分割
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html
        String sentence = "1-1,土岐田,男,90,20,70";
        String[]data = sentence.split(",",6);
        System.out.println(Arrays.toString(data));

        //文字列の連結
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/CharSequence.html
        String joinword = String.join(" ",data);
        System.out.println(joinword);

        //文字列の置換
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replace(char,char)
        String  original = "This is a pen.";
        String replace = original.replace("is","at");
        System.out.println(replace);

        //文字列の位置を検索する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#indexOf(int)
        sentence = "This is a pen.";
        int index = sentence.indexOf("is");
        System.out.println(index);//2

    }
}
