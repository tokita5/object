package asobiba.throwman;

public class Asasyon {
    public static void main(String[] args) {
        int num1 = getNum(2);
    }
    public static int getNum(int a) {
        assert a == 1 : "引数が1ではありません。";
        return a;
    }
}
