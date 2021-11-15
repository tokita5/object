package asobiba.stringpractis;

class LowerUpper {
    public static void main(String[] args) {
        //大文字から小文字へ
        String str1 = "ABCabcあいう";
        System.out.println(str1.toLowerCase());//abcabcあいう

        //小文字から大文字へ
        String str2 = "ABCabcあいう";
        System.out.println(str2.toUpperCase());//ABCABCあいう
    }
}
