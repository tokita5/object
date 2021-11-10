package asobiba.StringPractis;

import java.util.Arrays;
import java.util.List;

class Join {
    public static void main(String[] args) {
        String a = String.join("","あい","うえ","お");
        System.out.println(a);//あいうえお

        String b = String.join("-","あい","うえ","お");
        System.out.println(b);//あい-うえ-お

        //配列の各値を結合
        String[] colors1 = {"赤","黄","青"};
        String c = String.join("-","colors1");
        System.out.println(c);//赤-黄-青

        //リストの各値を結合
        List<String> colors2 = Arrays.asList(colors1);
        String d = String.join("+",colors2);
        System.out.println(d);//赤+黄+青
    }
}
