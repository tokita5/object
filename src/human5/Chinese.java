package human5;

//中国人クラス
class Chinese implements IFSayHello {
    protected String name;

    //コンストラクタ
    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("你好我的名字是"+name+"。");
    }

    }

