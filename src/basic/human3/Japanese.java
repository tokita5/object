package basic.human3;

//日本人クラス
class Japanese extends Human{

    public Japanese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は"+name+"です。");
    }
    }

