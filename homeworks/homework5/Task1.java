package java_hometasks.homeworks.homework5;

import java.util.Scanner;

public class Task1 {
    //Необходимо реализовать программу, которая будет бесконечно
    //считывать строки введенные пользователем и выводить их в консоль.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input any text: ");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }
    }
}






