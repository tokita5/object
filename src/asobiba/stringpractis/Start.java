package asobiba.stringpractis;

public class Start {
    public static void main(String[] args) {
        String str1 = "あいうえお";
        if (str1.startsWith("あいう")) {
            System.out.println("OK");//出力される
        }else{
            System.out.println("NG");
        }
        String str2 = "かきくけこ";
        if (str2.startsWith("かきく",0)) {
            System.out.println("OK");
        }else{
            System.out.println("NG");//出力される
        }
        if (str2.startsWith("かきく",1)) {
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        if (str2.startsWith("きくけ",1)) {
            System.out.println("OK");//出力される
        }else{
            System.out.println("NG");
        }
        String str3 = "たちつてと";
        if (str3.endsWith("つてと")) {
            System.out.println("OK");// 出力される
        }else{
            System.out.println("NG");
        }
        if (str1.endsWith("たちつ")){
            System.out.println("OK");
        }else{
            System.out.println("NG");//出力される
        }
    }
}
