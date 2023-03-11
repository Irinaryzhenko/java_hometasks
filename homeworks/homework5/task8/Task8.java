package java_hometasks.homeworks.homework5.task8;

import java.io.*;
import java.util.HashSet;

public class Task8 {
        public static void main(String[] args) {
            File firstFile= new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task8\\input1");
            File secondFile = new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task8\\input2");
            File resultFile = new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task8\\output");
            try (BufferedReader reader1 = new BufferedReader(new FileReader(firstFile));
                 BufferedReader reader2 = new BufferedReader(new FileReader(secondFile));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {
                String superText;
                HashSet<String> set1 = new HashSet<>();
                HashSet<String> set2 = new HashSet<>();
                while ((superText = reader1.readLine()) != null) {
                    set1.add(superText);
                }
                while ((superText = reader2.readLine()) != null) {
                    set2.add(superText);
                }
                set1.retainAll(set2);
                for (String s : set1) {
                    writer.write(s + System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}
