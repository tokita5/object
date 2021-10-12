package basic.figure3;

//長方形
class Rectangle implements IFGetArea {
    //フィールド
    private double height;
    private double width;

    //コンストラクタ
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    //ゲッター
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return width;
    }
    @Override
    public String toString() {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        //https://java-code.jp/173
        return String.format("長方形　高さ:%.2f 幅:%.2f 面積:%.2f",height,width,getArea());
    }
    @Override
    public double getArea() {
        return height*width;
    }
}