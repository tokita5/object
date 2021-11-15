package asobiba.throwman;

class Throws {
    public static void main(String[] args) {
        try {
            Sample.runSample();
        }catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
class Sample {
    static void runSample(){
        int i = 5;
        if (i==5) {
            // throwで、例外(NullPointerException)を発生させる
            throw new NullPointerException();
        }
    }
}