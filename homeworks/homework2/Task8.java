package java_hometasks.homeworks.homework2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Task8 {

    public static void main(String[] args) {
        String str = "Ваша карта N (2589-7859-7458-8521) активна";
        Pattern pattern = Pattern.compile("\\b(\\d{4}-){3}\\d{4}\\b");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}











