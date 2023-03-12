package java_hometasks.homeworks.homework5.task9_and_10;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Создать класс коробка (Box(x,y,z)). Создать 5 объектов. Сериализовать их в файл.
//Десериализовать объекты из задания #9. Отсортировать их по объёму.
       // Вывести на экран. Записать в файл (OUTPUT) самый большой объем.
public class Task9_and_10 {
    private static final String FILE_NAME = "C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task9_and_10\\output";

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Box(1, 2, 3));
        oos.writeObject(new Box(6, 6, 6));
        oos.writeObject(new Box(9, 12, 12));
        oos.writeObject(new Box(10, 12, 9));
        oos.writeObject(new Box(8, 9, 12));

        oos.close();

        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Box box = (Box) ois.readObject();
        Box box2 = (Box) ois.readObject();
        Box box3 = (Box) ois.readObject();
        Box box4 = (Box) ois.readObject();
        Box box5 = (Box) ois.readObject();

        ois.close();


        List<Box> boxes = new ArrayList<>();
        boxes.add(box);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);

        List<Box> sortedBoxByVolume = boxes.stream().sorted(Comparator.comparing(Box::volume)).toList();


        System.out.println(sortedBoxByVolume);

        Box maxVolumeBox = boxes.stream().max(Comparator.comparing(Box::volume)).get();

        System.out.println(maxVolumeBox);


        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task9_and_10\\output"))) {
            writer.println(maxVolumeBox);
        } catch (IOException e) {
            e.printStackTrace();
            }
        }
    }



