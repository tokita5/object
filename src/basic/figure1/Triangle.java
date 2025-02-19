package basic.figure1;

//三角形
class Triangle {
    //フィールド
    private double height;
    private double base;


    //コンストラクタ
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    /**
     * 面積を求める
     * @return
     */
    public double getArea(){
        return base*height/2;
    }

    @Override
    public String toString() {
        return String.format("三角形　高さ:%.2f 幅:%.2f 面積:%.2f",height,base,getArea());
    }
}

