package java_hometasks.homework2_and_3.practicalTasks;

public class Task2 {
    public static void main(String[] args) {
//        Напишите программу, которая будет переводить секунды в форматированный вид - часы минуты секунды учитывая окончания слов
//        Пример:
//        1249
//        20 минут 49 секунд
//        648958
//        180 часов 15 минут 58 секунд
//        Добавьте 3 строчку, которая будет выводить недели, сутки, часы минуты и секунды
        int seconds = 16579;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        int hourResult = hours % 24;

        int weeks = days / 7;
        int dayResult = days % 7;
      int minResult = minutes % 60;
      int secResult = seconds % 60;

        String hour;
        if (hours == 1) {
            hour = " час ";
        } else if (hours >= 2 && hours <= 4) {
            hour = " часа ";
        } else hour = " часов ";
        String minute;
        if (minResult == 1) {
            minute = " минута ";
        } else if (minResult >= 2 && minResult <= 4) {
            minute = " минтуты ";
        } else minute = " минут ";

        String second;
        if (secResult == 1) {
            second = " секунда.";
        } else if (secResult >= 2 && secResult <= 4) {
            second = " секунды.";
        } else second = " секунд.";

        String day;
        if (dayResult == 1) {
            day = " день ";
        } else if (dayResult >= 2 && dayResult <= 4) {
            day = " дня ";
        } else day = " дней ";

        String week;
        if (weeks >= 2 && weeks <= 4){
            week = " недели ";
        } else if (weeks == 1) {
            week = " неделя ";
        }else week = " недель ";


        System.out.println(weeks + week + dayResult + day +hourResult + hour + minResult + minute + secResult + second);


//        Определить является ли целое число чётным либо нечётным
        int number = 15;

        if (number % 2 == 0) {
            System.out.println("Число четное");

        } else System.out.println("Число нечетное");


        // По порядковому номеру пальца руки необходимо вывести его название на экран.

        int finger = 10;

        switch (finger) {
            case  1:
                System.out.println("Большой палец");
                break;
            case 2 :
                System.out.println("Указательный");
                break;
            case 3 :
                System.out.println("Средний");
                break;
            case 4 :
                System.out.println("Безымянный");
                break;
            case 5 :
                System.out.println("Мизинец");
                break;
            default:
                System.out.println("Упс! это не палец!");
        }

    }

}
