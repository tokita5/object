package human5;

class English implements IFSayHello {
    protected String name;

    //コンストラクタ
    public English(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello.I'm"+name);
    }
}
