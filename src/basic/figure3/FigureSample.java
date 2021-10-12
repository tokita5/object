package basic.figure3;

//図形の面積
public class FigureSample {
    public static void main(String[] args) {

        //インスタンスの作成
        IFGetArea[] figures = {
                new Rectangle(10,20),
                new Triangle(20,15),
                new Circle(10)
        };
        //出力
        for (IFGetArea figure:figures) {
            System.out.println(figure);
        }
    }
}