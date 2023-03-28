package java_hometasks.homeworks.homework5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int row = scanner.nextInt();

        System.out.println("Введите количество стоблцов: ");
        int column = scanner.nextInt();
        System.out.println();

        System.out.println("Введите первую матрицу");
        int[][] a = read(scanner, row, column);
        System.out.println();

        System.out.println("Введите вторую матрицу: ");
        int[][] b = read(scanner, row, column);
        scanner.close();

        int[][] sum = add(a, b);
        int[][] difference1 = subtract(a, b);
        int[][] difference2 = subtract(b, a);

        System.out.println("Сумма двух матриц: A + B = ");
               printMatrix(sum);

        System.out.println("Разность двух матриц: A - B = ");
                printMatrix(difference1);

        System.out.print("Pазность двух матриц в обратном порядке: B - A = ");
                printMatrix(difference2);

        scanner.close();
    }
    public static int[][] read(Scanner s, int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Введите значение [" + (i + 1) + "][" + (j + 1) +"]");
                 result[i][j] = s.nextInt();
            }
        }
        return result;
    }
    public static int[][] add(int[][] a, int [][] b) {
        int row = a.length;
        int column = a[0].length;
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    public static int[][] subtract(int[][] a, int [][] b) {
        int row = a.length;
        int column = a[0].length;
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


