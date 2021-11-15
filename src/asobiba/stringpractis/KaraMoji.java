package asobiba.stringpractis;

public class KaraMoji {
    public static void main(String[] args) {
        //equalsを使った空文字の比較
        String a = "";
        String b = "";
        String moji = "abc";

        //1.文字列.equals("")の場合
        if (moji.equals(a)) {
        }else {
            System.out.println("false");
        }
        //2."".equalsの場合
        if (a.equals(moji)) {
        }else{
            System.out.println("false");
        }
        //3."".equals("")の場合
        if (a.equals(b)) {
            System.out.println("true");
        }
    }
}
