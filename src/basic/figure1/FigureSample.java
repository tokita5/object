package basic.figure1;

//図形の面積
public class FigureSample {
    public static void main(String[] args) {

        //インスタンスの作成
        Rectangle r1 = new Rectangle(10,20);
        Triangle r2 = new Triangle(20,30);
        Circle r3 = new Circle(180);

        //出力
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
