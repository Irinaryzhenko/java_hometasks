package java_hometasks2;

public class Task6 {
    public static void main( String[] args ) {
        String text = "Imagination rules the world";
        String[] words = text.split( " " );
        String element = " ";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > element.length())
                element = words[i];
        }
        System.out.println(element);
    }
}
