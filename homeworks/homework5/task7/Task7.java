package java_hometasks.homeworks.homework5.task7;


import java.io.*;
import java.util.ArrayList;

//Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
//строки из первого, но в обратном порядке (первая строка должна быть последней).
public class Task7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Чтение из файла");
        ArrayList<String> list = new ArrayList<String>();
        try  {
                File file = new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task7\\task7new");
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String line = reader.readLine();
                list.add(line);

                while (line != null) {
                    System.out.println(line);
                    list.add(line);
                    line = reader.readLine();
                }

                reader.close();
                fileReader.close();

            } catch (
            FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        // запись в файл
         try (FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task7\\task7new2")) {
                int reversText = list.size();
                String s = "";
                 for(
                int i = reversText - 1;
                i >0; i--)

                {
                    s = list.get(i);
                    writer.append(s + "\n");
                }
            writer.flush();
            }
        catch(IOException ex){

                System.out.println(ex.getMessage());
            }
    }
}


