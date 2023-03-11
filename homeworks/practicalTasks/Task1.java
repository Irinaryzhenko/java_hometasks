package java_hometasks.homeworks.practicalTasks;

public class Task1 {
    // Вывести последнюю цифру числа

    public static void main(String[] args) {
        int digit = 1234567;
        int lastDigit = digit % 10;
        System.out.println(lastDigit);

        //Найти сумму цифр ab + cd числа abcd

        int adcd = 1234;
        int cd = 1234 % 100;
        int ab = adcd / 100;
        int sum = ab + cd;
        System.out.println(sum);

        //Вывести 3юю цифру 5ти-значного числа
        int dig = 23456;
        int thirdDigit = (dig / 100) % 10;
        System.out.println(thirdDigit);

        //Вывести длину отрезка, проходящей через две точки


        //Имеется прямоугольное отверстие размера a на b. Определить можно ли полностью закрыть отверстие круглой картонкой радиусом r
        //Пример:
        //6
        //8
        //5
        //Картонка с радиусом 5 закрывает полностью отверстие размера 6 * 8
        //Вывести уравнение прямой, проходящей через две точки



    }
}
