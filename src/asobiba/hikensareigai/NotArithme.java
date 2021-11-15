package asobiba.hikensareigai;

class NotArithme {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        try{
            test2.runSample1();
        }catch (ArithmeticException e) {
            System.out.println(e);
            //java.lang.ArithmeticException: / by zero
        }
    }
}
class Test2 {
    void runSample1(){
        Test3.runSample3();
        // try-catchがないので例外はさらに呼び出し元に投げられる
    }
}
class Test3 {
   static void  runSample3(){
        // try-catchがないため呼び出し元に例外が投げられる
        int i;
        i = 10/0;
    }
}