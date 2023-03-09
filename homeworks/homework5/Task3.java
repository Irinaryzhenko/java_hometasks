package java_hometasks.homeworks.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//   Необходимо реализовать программу, которая будет считывать
//    числа, введенные пользователем, пока пользователь не введет
//"stop" слово. по команде "status" необходимо вывести введенные
//    цифры в отсортированном виде (от меньшего к большему).


public class Task3 {
    private static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.println("Please, input integers or 'stop' to quit: ");


        while (true) {

            if (in.hasNextInt()) {
                numbers.add(in.nextInt());
                continue;
            }

            String word = in.nextLine();

            if (word.equalsIgnoreCase("status")) {
                List<Integer> sorted = numbers.stream().sorted(Integer::compareTo).toList();
                sorted.forEach(System.out::println);

            } else  if (word.equalsIgnoreCase("stop")) {

                System.out.println("You stopped program");

                break;
            }
        }
    }

}






