package basic.inspection;

import java.util.ArrayList;
import java.util.List;

public class ViewResult {
    public static void main(String[] args) {
        List<Result> resultList = new ArrayList<>();
        resultList.add(new Result(
                "202110190311",
                "土岐田裕也",
                "2021-10-19T11:11:11",
                36.5, 85, 80, 90));

        for (Result result : resultList) {
            System.out.println(result);
        }
    }
}