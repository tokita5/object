package asobiba;

public class Equals {
    public static void main(String[] args) {
        //値が同じ
        String a1 = "あいう";
        String a2 = "あいう";
        if (a1.equals(a2)) {
            System.out.println("OK");//出力される
        }else{
            System.out.println("NG");
        }
        //値が異なる
        String b1 = "あいう";
        String b2 = "かきく";
        if (b1.equals(b2)) {
            System.out.println("OK");
        }else {
            System.out.println("NG");//出力される
        }
        //値は同じだがデータが異なる

    }
}
