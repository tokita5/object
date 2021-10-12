package human4;

//韓国人クラス
class Korean extends Human {

    public Korean(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("제 이름은"+name+"예요");
    }

    }

