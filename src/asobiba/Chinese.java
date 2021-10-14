package asobiba;

//中国人クラス
class Chinese extends Human {

    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("你好我的名字是"+name+"。");
    }

    }

