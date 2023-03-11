package java_hometasks.homeworks.homework5.task8;


//Имеется два файла (INPUT_1 и INPUT_2). В третий (OUTPUT) необходимо
  //записать только те строки, которые есть и в первом, и во втором.

import java.io.*;
import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        try {
            File file1 = new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task8\\input1");
            FileReader fileReader1 = new FileReader(file1);
            BufferedReader reader1 = new BufferedReader(fileReader1);
            String line1 = reader1.readLine();


            File file2 = new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task8\\input2");

            FileReader fileReader2 = new FileReader(file2);

            BufferedReader reader2 = new BufferedReader(fileReader2);

            String line2 = reader2.readLine();
            if (line1.equalsIgnoreCase(line2)) {
                list.add(line1);
                list.add(line2);
            }

                while (line1 != null || line2 != null) {
                    System.out.println(line1);
                    System.out.println(line2);
                    list.add(line1);
                    list.add(line2);
                    line1 = reader1.readLine();
                    line2 = reader2.readLine();
                }
                reader1.close();
                reader2.close();
                fileReader1.close();
                fileReader2.close();

            } catch(
                    IOException e){
                e.printStackTrace();
            }

        File file3 = new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task8\\output");
        FileWriter writer = null;

        try {
            writer = new FileWriter(file3);
            writer.write(String.valueOf(list));
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }






