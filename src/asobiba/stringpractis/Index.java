package asobiba.stringpractis;

class Index {
    public static void main(String[] args) {
        //前から検索(引数1つ)
        String str1 = "abcabc";
        System.out.println(str1.indexOf("a"));//0
        System.out.println(str1.indexOf("b"));//1
        System.out.println(str1.indexOf("c"));//2
        System.out.println(str1.indexOf("abc"));//0
        System.out.println(str1.indexOf("z"));//-1

        String str2 = "あいうあいう";
        System.out.println(str2.indexOf("あ"));//0
        System.out.println(str2.indexOf("い"));//1
        System.out.println(str2.indexOf("う"));//2

        //開始位置を指定して前から検索(引数2つ)
        String str3 = "あいうあいう";
        System.out.println(str3.indexOf("あ", 0));//0
        System.out.println(str3.indexOf("あ", 1));//3
        System.out.println(str3.indexOf("あ", 2));//3
        System.out.println(str3.indexOf("あ", 3));//3
        System.out.println(str3.indexOf("あ", 4));//-1
        System.out.println(str3.indexOf("あ", 5));//-1
    }
}
