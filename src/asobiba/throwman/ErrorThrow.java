package asobiba.throwman;

class ErrorThrow {
    public static void main(String[] args) {
        try{
            Sample.runSample();
            //例外をキャッチ
        }catch (ArithmeticException e) {
            System.out.println("エラー2");
        }
        System.out.println("終了です");
    }
}
class Sample1 {
    static void runSample(){
        try{
            int i = 6/0;
        }catch (ArithmeticException e) {
            System.out.println("エラー1");
            throw e; //例外をスルーする
        }
    }
}