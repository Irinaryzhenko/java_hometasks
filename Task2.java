package java_hometasks;

public class Task2 {
    public static void main (String [] args) {
        //Задание 2
        //Необходимо найти сумму всех четных чисел в последовательности Фибоначи, до
        //определенного индекса "n".
        //Например:
        //    Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
        //    n = 7
        //    Сумма всех четных до 7го.  равна 2 + 8 = 10.

        int [] array = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 7) {
                sum = sum + array[i];
            }

        }
        System.out.println(sum);

    }
}
