package student;

public class Student {
    //フィールドの宣言
    private String name;
    private String gender;
    private int grade;

    //コンストラクタ
    public Student(String name, String gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    //ゲッター
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }

    //セッター
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        String age = new String();
        return "Human{"+"name"+name+'\''+", age="+age+'}';
    }
    }

