package asobiba.stringpractis;

class Split {
    public static void main(String[] args) {
        //カンマで区切る
        String str1 = "a,b,c";
        String arr1[] = str1.split(",");
        for (String a :arr1) {
            System.out.println(a);//a b c
        }
        System.out.println(arr1.length);//3


        //タブで区切る
        String str2 = "a  b  c";
        String arr2[] = str2.split("\t");
        for (String b :arr2) {
            System.out.println(b);//a b c
        }
        System.out.println(arr2.length);//3


        //スラッシュで区切る
        String str3 = "2021/11/10";
        String arr3[] = str3.split("\\/");
        for (String c :arr3) {
            System.out.println(c);//2021 11 10
        }
        System.out.println(arr3.length);//3


        //
    }
}