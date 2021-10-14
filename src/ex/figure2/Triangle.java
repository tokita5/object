package ex.figure2;

//三角形
class Triangle extends Figure {
    //フィールド
    private double height;
    private double base;


    //コンストラクタ
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    //ゲッター
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getArea(){
        return base*height/2;
    }

    @Override
    public String toString() {
        return String.format("三角形　高さ:%.2f 幅:%.2f 面積:%.2f",height,base,getBase(),getHeight());
    }
}

