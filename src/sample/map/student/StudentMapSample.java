package sample.map.student;

import netscape.javascript.JSObject;
import sample.enumsample.Gender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {
    public static void main(String[] args) {
        //クラスごとのマップ
        Map<String, List<Student >> studentGroupMap =  new HashMap<>(40);
        //学生のリスト
        List<Student>studentList = new ArrayList<>(100);
        studentList.add(new Student("1-1","岸田", Gender.MEN,98,88,80));
        studentList.add(new Student("1-1","バイデン",Gender.MEN,90,90,90));
        studentList.add(new Student("1-1","エリザベス",Gender.WOMEN,95,65,100));
        studentList.add(new Student("1-2","神宮寺",Gender.MEN,98,88,20));
        studentList.add(new Student("1-2","伊弉冉",Gender.MEN,87,91,76));
        studentList.add(new Student("1-2","観音坂",Gender.MEN,80,80,47));
        studentList.add(new Student("1-3","織田",Gender.MEN,90,90,90));
        studentList.add(new Student("1-3","豊臣",Gender.MEN,80,80,80));
        studentList.add(new Student("1-3","徳川",Gender.MEN,70,70,70));
        studentList.add(new Student("1-4","東方天",Gender.WOMEN,100,100,100));
        studentList.add(new Student("1-4","勘解由小路",Gender.WOMEN,80,70,99));
        studentList.add(new Student("1-4","碧棺",Gender.WOMEN,89,90,97));
        studentList.add(new Student("1-5","土方",Gender.MEN,87,77,69));
        studentList.add(new Student("1-5","沖田",Gender.MEN,90,89,94));
        studentList.add(new Student("1-5","近藤",Gender.MEN,56,44,19));

        for (Student student:studentList) {
            if (studentGroupMap.containsKey(student.getGroup())) {
                //リストに追加
                studentGroupMap.get(student.getGroup()).add(student);
            }else{
                //新しいキーを作成
                //空のリストをセット
                List<Student>list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(),list);
            }
        }

        for (Map.Entry entry:studentGroupMap.entrySet()) {
            List<Student>list = (List<Student>) entry.getValue();
            for (Student student:list) {
                System.out.println(student);
            }
        }
        for (Map.Entry entry : studentGroupMap.entrySet()) {
            double sumJap=0,sumMath = 0,sumEng = 0;
            for (Student student:(List<Student>)entry.getValue()) {
                sumJap+= student.getJap();
                sumMath+= student.getMath();
                sumEng+= student.getEng();
            }
            double aveJap= sumJap/ ((List<?>) entry.getValue()).size();
            double aveMath= sumMath/((List<?>) entry.getValue()).size();
            double aveEng= sumEng/((List<?>) entry.getValue()).size();

            System.out.println(String.format("%s %.2f %.2f %.2f",entry.getKey(),aveJap,aveMath,aveEng));
        }
    }
        }
