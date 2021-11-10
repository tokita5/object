package asobiba.StringPractis;

public class Length {
    public static void main(String[] args) {
        //文字列の長さを取得
        String str1 = "あいう+1";
        System.out.println(str1.length());//5

        //for文で文字の長さを取得
        String a = "abc";
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));//abc
            System.out.println(a.codePointAt(i));//97 98 99
        }
    }
}
