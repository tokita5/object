package basic.figure1;

//図形の面積
public class FigureSample {
    public static void main(String[] args) {

        //インスタンスの作成と出力
        Rectangle r1 = new Rectangle(10,20);
        System.out.println(r1);

        Triangle r2 = new Triangle(20,30);
        System.out.println(r2);

        Circle r3 = new Circle(180);
        System.out.println(r3);
    }
}
