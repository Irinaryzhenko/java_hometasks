package java_hometasks.homeworks.homework5.task6;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\User\\Desktop\\Home\\java_hometasks\\homeworks\\homework5\\task6\\matrix"));

            int a = scanner.nextInt();
            int b = scanner.nextInt();


            int[][] firstMatrix = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    firstMatrix[i][j] = scanner.nextInt();
                }
            }

            scanner.nextLine();

            int[][] secondMattrix = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    secondMattrix[i][j] = scanner.nextInt();
                }
            }

            int[][] matrixSum = new int[a][b];
            int[][] matrixDifference = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    matrixSum[i][j] = firstMatrix[i][j] + secondMattrix[i][j];
                    matrixDifference[i][j] = firstMatrix[i][j] - secondMattrix[i][j];
                }
            }

            System.out.println("Сумма матриц составляет: ");
            printMatrix(matrixSum);

            System.out.println("Разность матриц составляет:");
            printMatrix(matrixDifference);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Матрицы не найдены: " + e.getMessage());
        }
    }

    public static void printMatrix(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

