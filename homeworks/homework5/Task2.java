package java_hometasks.homeworks.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


//    //Необходимо реализовать программу, которая будет считывать
//    //числа (целые), введенные пользователем, пока пользователь
//    //не введет "stop" слово. После чего программа выведет среднее
//    //из всех введенных значений.

public class Task2 {
    private static int count = 0;

    private static void increaseCount() {
        count++;
    }
    private static List<Integer> numbers = new ArrayList();


    private static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println("Please, input integers or 'stop' to quit: ");

        while (true) {

            if (in.hasNextInt()) {
                increaseCount();
                numbers.add(in.nextInt());

                continue;

            }

            String word = in.nextLine();

            if (word.equalsIgnoreCase("stop")) {
                AtomicInteger sum = new AtomicInteger();
                numbers.stream()
                        .forEach(element -> sum.addAndGet(element));

                System.out.println("You stopped program: " + (double) sum.get() / numbers.size());

                break;
            }

        }
    }
}





