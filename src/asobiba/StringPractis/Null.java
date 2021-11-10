package asobiba.StringPractis;

public class Null {
    public static void main(String[] args) {
        String a = null;
        String b = null;
        String moji = "abc";

        //1.null.equals(文字列)の場合
        try{
            if (a.equals(moji)) {
                System.out.println("true");//出力されない
            }
        }catch (NullPointerException e) {
            System.out.println(e);//NullPointerExceptionが出力される
        }
        //2.文字列.equals(null)の場合
        if (moji.equals(a)) {
        }else{
            System.out.println("false");//falseが出力される
        }
        //3.null.equals(null)の場合
        try{
            if (a.equals(b)) {
            }else{
                System.out.println("false");//出力されない
            }
        }catch (NullPointerException e) {
            System.out.println(e);//NullPointerExceptionが出力される
        }
        //nullかどうか確認したい～＝＝を使う
        String g = null;
        if (g==null) {
            System.out.println("true");//trueが出力される
        }

    }
}