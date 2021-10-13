package basic.human5;

class HumanSample {
    public static void main(String[] args) {

        IFSayHello[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("李小龙"),
                new Korean("지수")
        };
        for (IFSayHello human : humans) {
            human.sayHello();
        }
    }
}