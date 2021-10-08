package student;

public class StudentSample {
    public static void main(String[] args) {
    Student student1 = new Student("ときた","男",3);

        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getGrade());

        student1.setName("ときた");
        System.out.println(student1);
        student1.setGender("男");
        student1.setGrade(2);
        System.out.println(student1);
    }

}
