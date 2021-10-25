package ex.bmi;

import sample.enumsample.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewMember {

    public static void main(String[] args) {
        List<Member>memberList = new ArrayList<>();

        memberList.addAll(Arrays.asList(
                new Member("織田",Gender.MEN,35,1.73,63.0),
                new Member("徳川",Gender.MEN,28,1.52,62.3),
                new Member("お市",Gender.WOMEN,23,1.46,38.5),
                new Member("濃姫",Gender.WOMEN,35,1.56,42.5),
                new Member("豊臣",Gender.MEN,29,1.65,56.8)
        ));

        for (Member member:memberList) {
            System.out.println(member);
        }
    }
}