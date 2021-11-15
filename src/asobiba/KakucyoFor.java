package asobiba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KakucyoFor {
    public static void main(String[] args) {
        //continueでループの先頭に戻る
        List<String> c1 = new ArrayList<>(Arrays.asList("赤","黄","青"));

        for (String a : c1) {
            if (a=="黄") {
                continue;
            }
            System.out.println(a);
        }
        }
        }



