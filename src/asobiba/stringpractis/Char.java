package asobiba.stringpractis;

class Char {
    public static void main(String[] args) {
        String a = "ABあい";

        System.out.println(a.charAt(0));//A
        System.out.println(a.charAt(1));//B
        System.out.println(a.charAt(2));//あ
        System.out.println(a.charAt(a.length()-1));//い

        System.out.println(a.charAt(9));//IndexOutOfBoundsException

        String str2 = "BCうい";
        String outMoji = "";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i)=='あ') {
                continue;
            }
            outMoji = outMoji + str2.charAt(i);
        }
        System.out.println(outMoji);//ABい
    }
}
