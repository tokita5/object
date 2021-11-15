package asobiba.throwman;

class DokujiThrow {
    public static void main(String[] args) {
        try {
            Sampling.runSample();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
class Sampling {
    static void runSample(){
        int i = 5;
        if (i==5){
            throw new NullPointerException("エラーです。");
        }
    }
}