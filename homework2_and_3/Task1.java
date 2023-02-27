package java_hometasks.homework2_and_3;

public class Task1 {
    public static void main(String[] args) {
        String name = "JANUARY";
        Month month = Month.valueOf(name);
        int number;
        number = Month.getNumberByName(name);
        System.out.println(number);

        number = 6;
        Month month1 = Month.valueOf(name);
        String nameOfMonth = Month.getNameOfNumbers(number);
        System.out.println(nameOfMonth);


    }
}

