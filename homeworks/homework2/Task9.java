package java_hometasks.homeworks.homework2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String str = "А есть ли слово";
        String word = "Слово";
        Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
    }

    }
