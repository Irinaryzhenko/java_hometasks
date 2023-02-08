package java_hometasks.homework2;

public class Task5 {
    public static void main(String[] args) {
        String str = "Экспресс несется с огромной соростью на дальнее расстояние, спаситись не удастся.";
        String[] array = str.split(" ");
        int resultCounter = 0;
        for (String element : array) {
            if (element.contains("с")) {
                char[] chars = element.toCharArray();
                int count = 0;
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == 'с') {
                        count++;
                    }
                }
                if (count >= 3) {
                    resultCounter++;
                }
            }
        }
        System.out.println(resultCounter);
    }
}









