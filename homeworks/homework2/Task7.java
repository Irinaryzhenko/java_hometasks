package java_hometasks.homeworks.homework2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task7 {
    public static void main(String[] args) {
        String str = "анапа, аа, а АНАНАСИНА, африка";
        Pattern pat = Pattern.compile("\\b[Аа][А-Яа-я]*[Аа]*\\b|\\b[Аа]\\b");
        Matcher mat = pat.matcher(str);
        System.out.println(mat.find());
    }
}