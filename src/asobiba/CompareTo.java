package asobiba;

class CompareTo {
    public static void main(String[] args) {
        //値が同じ
        String a1 = "あいう";
        String a2 = "あいう";
        if (a1.compareTo(a2)==0) {
            System.out.println("OK");//出力される
        }else{
            System.out.println("NG");
        }
        //値が異なる
        String b1 = "あいう";
        String b2 = "かきく";
        if (b1.compareTo(b2)==0) {
            System.out.println("OK");
        }else{
            System.out.println(b1.compareTo(b2));//-9が出力
        }
        //値が異なる
        String c1 = "かきく";
        String c2 = "あいう";
        if (c1.compareTo(c2)==0) {
            System.out.println("OK");
        }else{
            System.out.println(c1.compareTo(c2));//9が出力
        }
        //equalsIgnoreCaseメソッド～英字の大小を比較しない
        String d1 = "ABC";
        String d2 = "abc";
        System.out.println(d1.equalsIgnoreCase(d2));//true

        //ただのequalsの場合
        System.out.println(d1.equals(d2));//false
    }
}