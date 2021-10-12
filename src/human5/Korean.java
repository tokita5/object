package human5;

//韓国人クラス
class Korean implements IFSayHello {
    protected String name;

    public Korean(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("제 이름은"+name+"예요");
    }

    }

