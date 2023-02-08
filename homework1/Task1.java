package java_hometasks.homework1;

public class Task1 {
    public static void main (String[] args) {
        int [] array = {11, 10, 15, 5}; // числом "n" по условиям задачи будем 10
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 10) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}
