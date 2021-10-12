package human4;

class HumanSample {
    public static void main(String[] args) {
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("李小龙"),
                new Korean("지수")
        };
        for (Human human : humans) {
            human.sayHello();
        }
    }
}