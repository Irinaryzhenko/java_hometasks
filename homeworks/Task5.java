package java_hometasks.homeworks;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task5 {
    public static void main(String[] args) {
        int count = 0;
       String str = "Привет, сссс аоловажцож ссссдыв";
       Pattern pattern = Pattern.compile("\\b((\\S*[Сс]\\S*){3})\\b");
       Matcher matcher = pattern.matcher(str);
       while (matcher.find()) {
            count++;
       }
        System.out.println(count);
  }
}









