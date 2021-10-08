package basic.human1;

//参照型のサンプル
public class ReferenceSample {
    public static void main(String[] args) {
        Human human1 = new Human("Tom",28);
        Human human2 = human1;
        Human human3 = new Human(human1);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        human1.setName("Jisoo");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
