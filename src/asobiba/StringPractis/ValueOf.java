package asobiba.StringPractis;

class ValueOf {
    public static void main(String[] args) {
        //数値を文字列に変換
        int num1 = 100;
        long num2 = 100;
        float num3 = 100.25f;
        double num4 = 100.25;

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        String str3 = String.valueOf(num3);
        String str4 = String.valueOf(num4);


        //文字列を数値(int型)にする
        String str5 = "100";
        int num5 = Integer.valueOf(str5);
        int num6 = Integer.parseInt(str5);
        String str6 = "-100";
        int num7 = Integer.valueOf(str6);
        int num8 = Integer.valueOf(str6);


        //(long)型にする
        String str7 = "100";
        long num9 = Long.valueOf(str7);
        long num10 = Long.valueOf(str7);

        String str8 = "-100";
        long num11 = Long.valueOf(str8);
        long num12 = Long.valueOf(str8);


        //(float/double)型にする
        String str9 = "100.25";
        float num13 = Float.valueOf(str9);
        float num14 = Float.parseFloat(str9);

        double num15 = Double.valueOf(str9);
        double num16 = Double.parseDouble(str9);


        //int型とdouble型を変換
        int a = 100;
        double b = a; //int型からdouble型に変換
        System.out.println(b); //100

        double c = 100.25;
        int d = (int)c; //double型からint型に変換,この時はキャストを行うため()が必要になる。
        //        System.out.println(d); //100


    }
}
