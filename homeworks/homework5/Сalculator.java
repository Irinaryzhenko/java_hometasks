package java_hometasks.homeworks.homework5;


import java.util.Scanner;

//Необходимо реализовать программу "калькулятор".
//Поддерживаемые операции +-/* выбор операции и ввод данных
//осуществляется пользователем с клавиатуры.
public class Сalculator {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        System.out.println("Input number:");
        int digit;
        if(scanner.hasNextInt()){
            digit = scanner.nextInt();
        } else {
            System.out.println("ERROR! Please, try again.");
            scanner.next();
            digit = getInt();
        }
        return digit;
    }

    public static char getOperation(){
        System.out.println("Input operation");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("ERROR! Please, try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int digit1, int digit2, char operation){
        int result;
        switch (operation){
            case '+':
                result = digit1 + digit2;
                break;
            case '-':
                result = digit1 - digit2;
                break;
            case '*':
                result = digit1 * digit2;
                break;
            case '/':
                result = digit1 / digit2;
                break;
            default:
                System.out.println("Unknown operation.Try again");
                result = calc(digit1, digit2, getOperation());
        }
        return result;
    }

    public static void main(String[] args) {
        int digit1 = getInt();
        int digit2 = getInt();
        char operation = getOperation();
        int result = calc(digit1,digit2,operation);
        System.out.println("Your result: " + result);
    }
}


