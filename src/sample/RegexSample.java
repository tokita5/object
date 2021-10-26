package sample;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;

//正規表現のサンプル
public class RegexSample {
    public static void main(String[] args) {

        //郵便番号の正規表現
    String regex = "^[0-9]{3}-[0-9]{4}$";
    String zip1 = "007-0865";
        System.out.println(zip1.matches(regex));//true
        String zip2 = "0050-469";
        System.out.println(zip2.matches(regex));//false

        //正規表現の準備
        Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        Matcher matcher = pattern.matcher(zip1);

        List<String> zipList = List.of("007-0865","0050-469");

        for (String zip:zipList) {
            matcher = pattern.matcher(zip);
            if (matcher.matches()) {
                System.out.println(zip+":ok");
            }else {
                System.out.println(zip+":ng");
            }
        }
    }
}