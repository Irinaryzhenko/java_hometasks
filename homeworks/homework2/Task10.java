package java_hometasks.homeworks.homework2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task10 {
    public static class Box {
        private static final String BOX_REGEXP = "Box\\[(\\d)(,(\\d)(,(\\d))?)?]";
        private static final Pattern PATTERN = Pattern.compile(BOX_REGEXP);

        private int x, y, z;
        public Box(String str) {
            Matcher matcher = PATTERN.matcher(str);
            if (matcher.find()) {
                this.x = Integer.parseInt(matcher.group(1));
                if (matcher.group(3) != null) {
                    this.y = Integer.parseInt(matcher.group(3));
                    if (matcher.group(5) != null) {
                        this.z = Integer.parseInt(matcher.group(5));
                    }
                }
            }
        }
    }
}
