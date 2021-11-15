package asobiba.stringpractis;

class Empty {
    public static void main(String[] args) {
        //空文字の時
        String a = "";
        if (a.isEmpty()) {
            System.out.println("true");
        }
        //空文字でない
        String b = "あいうえお";
        if (b.isEmpty()) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        //nullの時
        String c = null;
        if (c.isEmpty()) {
            System.out.println("true");//NullPointerExceptionの例外が発生
        }
    }
}
