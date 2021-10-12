package basic.figure3;

//三角形
class Triangle implements IFGetArea{
    //フィールド
    private double height;
    private double base;

    //コンストラクタ
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    public String toString() {
        return String.format("三角形　高さ:%.2f 幅:%.2f 面積:%.2f",height,base,getArea());
    }
    @Override
    public double getArea() {
        return base*height/2;
    }
}