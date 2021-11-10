package asobiba.StringPractis;

class TrimStrip {
    public static void main(String[] args) {
        //半角空白を取り除く
        String str1 = " あいう +1"  ;
        String str2 = str1.trim();

        System.out.println(str2);//あいう△+1
        System.out.println(str2.length());//6

        //別の文字に置き換える
        String str3 = "あ い う +1  ";
        String str4 = str3.replace(" ","");

        System.out.println(str4);//あいう+1
        System.out.println(str4.length());//5

        //全角と半角の空白を取り除く
        String str5 = " 　あいう　+1　  ";
        String str6 = str5.strip();

        System.out.println(str6);//あいう△+1
        System.out.println(str6.length());//6
    }
}