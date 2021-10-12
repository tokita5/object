package human4;

//抽象
abstract class Human {
    //フィールド
    protected String name;

    //コンストラクタ
    public Human(String name) {
        this.name = name;
    }

    //処理
    abstract public void sayHello() ;
}
