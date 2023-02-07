package java_hometasks2;

public class Task7 {
    public static void main(String[] args) {
        int count = 0;
        String s = "Alice arrived in AlabamA city yesterday";

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if ((words[i].startsWith("a") || words[i].startsWith("A")) && (words[i].endsWith("a") || words[i].endsWith("A"))) {
                count++;
                System.out.println(words[i]);
            }
        }
        System.out.println(count + " words");
    }
}
