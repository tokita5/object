package ex;

public class AsobiSample {
    public static void main(String[] args) {
        Student[] students ={
                new Student("あいざわ","男",60,50,70),
                new Student("いのうえ","女",90,80,100),
                new Student("うえの","男",40,50,60),
                new Student("えんどう","女",80,20,60),
                new Student("おおた", "男",70,100,40),
        };
        for (Student student:students){
            System.out.println(student);
        }
    }
}
