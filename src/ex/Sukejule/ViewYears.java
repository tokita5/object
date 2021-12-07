package ex.Sukejule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class ViewYears {

    public static void main(String[] args) {
        question1();
    }

    private static void question1() {
        //日付計算
        //現在日時
        Calendar calendar = Calendar.getInstance();
        Date now = Calendar.getInstance().getTime();
        //1年後
        calendar.setTime(now);
        calendar.add(YEAR, 1);
        Date date1 = calendar.getTime();
        //2日前
        calendar.setTime(now);
        calendar.add(DAY_OF_MONTH, 2);
        Date date2 = calendar.getTime();
        //3週間前
        calendar.setTime(now);
        calendar.add(DAY_OF_WEEK, -3);
        Date date3 = calendar.getTime();
        //4日前
        calendar.setTime(now);
        calendar.add(DAY_OF_MONTH, -4);
        Date date4 = calendar.getTime();
        //5時間後
        calendar.setTime(now);
        calendar.add(HOUR, 5);
        Date date5 = calendar.getTime();
        //6分前
        calendar.setTime(now);
        calendar.add(MINUTE, -6);
        Date date6 = calendar.getTime();
        //7秒前
        calendar.setTime(now);
        calendar.add(SECOND, -7);
        Date date7 = calendar.getTime();

        //Date Formatを生成する
        DateFormat format = new SimpleDateFormat("yyyy年MM時dd日 hh時mm分ss秒");
        System.out.println("現在日時:" + format.format(now));
        System.out.println("1年後:" + format.format(date1));
        System.out.println("2日前:" + format.format(date2));
        System.out.println("3週間前:" + format.format(date3));
        System.out.println("4日前:" + format.format(date4));
        System.out.println("5時間後:" + format.format(date5));
        System.out.println("6分前:" + format.format(date6));
        System.out.println("7秒前:" + format.format(date7));
    }

    /*
    問題2
     */
    private static void question2() {
        // 日付計算
        // 現在日時
        LocalDateTime now = LocalDateTime.now();
        // 1年後
        LocalDateTime date1 = now.plusYears(1);
        // ２ヶ月後
        LocalDateTime date2 = now.plusMonths(2);
        // ３週間前
        LocalDateTime date3 = now.minusWeeks(3);
        // ４日前
        LocalDateTime date4 = now.minusDays(4);
        // 5時間後
        LocalDateTime date5 = now.plusHours(5);
        // 6分前
        LocalDateTime date6 = now.minusMinutes(6);
        // 7秒前
        LocalDateTime date7 = now.minusSeconds(7);

        // 表示
        // 出力フォーマットを指定
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
        System.out.println("問題2");
        System.out.println("現在日時:" + dtf.format(now));
        System.out.println("1年後:" + dtf.format(date1));
        System.out.println("2ヶ月後:" + dtf.format(date2));
        System.out.println("3週間前:" + dtf.format(date3));
        System.out.println("4日前:" + dtf.format(date4));
        System.out.println("5時間後:" + dtf.format(date5));
        System.out.println("6分前:" + dtf.format(date6));
        System.out.println("7秒前:" + dtf.format(date7));
    }

    public static void question3() {

        // 2000年～2100年まで
        for (
                int year = 2000;
                year < 2101; year++) {

            // 年号を4で割った余りが0の時
            if (year % 4 == 0) {

                // 年号を100で割り切れない時
                if (year % 100 != 0) {
                    System.out.println(year + "年は「うるう年」です。");
                    continue;
                }

                // 年号を400で割り切れる時
                if (year % 400 == 0) {
                    System.out.println(year + "年は「うるう年」です。");
                } else {
                    System.out.println(year + "年は「うるう年」ではありません。");
                }

            } else {
                System.out.println(year + "年は「うるう年」ではありません。");
            }
        }
    }
}