package ex.exception;

public class IOException {
    public static void main(String[] args) {
        int[] num = {1, 23, 75};
        System.out.println("開始");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(num[i]);
            }
        }catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
        }
        finally {
            System.out.println("終了");
        }
    }
}
