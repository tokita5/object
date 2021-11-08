package asobiba;

class Equals {
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
        String c1 = "1";
        int c2 = 1;
        if (c1.equals(c2)) {
            System.out.println("OK");
        }else{
            System.out.println("NG");//出力される
        }
        //英字の大文字と小文字が区別される
        String d1 = "ABC";
        String d2 = "ABc";
        if (d1.equals(d2)) {
            System.out.println("OK");
        }else{
            System.out.println("NG");//出力される
        }
        //==での比較、参照先が異なっている場合はfalseになる
        String e1 = new String("あいう");
        String e2 = new String("あいう");
        if (e1==e2) {
            System.out.println("OK");
        }else{
            System.out.println("NG");//出力される
        }
    }
}
