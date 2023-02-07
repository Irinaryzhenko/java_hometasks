package java_hometasks2;

public class Task9 {
    public static void main (String[] args) {
        String greatText = "Never stop dreaming";
        String[] arrays = greatText.split(" ");

        String neededWord = "stop";
        for (String array : arrays) {
            if (array.contains("stop")) {
                int index = neededWord.indexOf('s');

                System.out.println(index);

            }
        }
    }
}
