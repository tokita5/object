package asobiba.hikensareigai;

class Arithme {
    public static void main(String[] args) {
        try{
            Sample.runSample();
        }catch(ArithmeticException e) {
            System.out.println(e);
            //java.lang.ArithmeticException: / by zero
        }finally {
            System.out.println("finallyの実行");
        }
    }
}
class Sample {
    static  void runSample(){
        // 0による除算のためArithmeticExceptionの例外が発生
        int i = 0;
        i = 10 / 0;
    }
}