package asobiba.stringpractis;

class BuilderConcat {
    //文字列の結合～toString以下は文字列を返している
    public static void main(String[] args) {
        //String Builder型
        String s1 = "あいう";
        String s2 = "えお";
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        System.out.println(sb.toString());//あいうえお

        String s3 = null;
        sb.append(s3);
        System.out.println(sb.toString());//あいうえおnull

        int s4 = 100;
        sb.append(s4);
        System.out.println(sb.toString());//あいうえおnull100

        //String Buffer型
        String t1 = "アイウ";
        String t2 = "エオ";

        StringBuffer sf= new StringBuffer();
        sb.append(t1);
        sb.append(t2);

        System.out.println(sb.toString());//アイウエオ

        //+演算子で結合する
        System.out.println("ab" + "c");

        //concatで連結する
        String f1 = "123";
        String f2 = "45";

        String f3 = f1.concat(f2);
        System.out.println(f3);//12345
    }
}
