package tinkoff_contest;

import java.util.Scanner;

public class D_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String rotate = scanner.next();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        if (rotate.equals("L")) {
            rotateCounterClockwise(mat, n);
        } else {
            rotateClockwise(mat, n);
        }

        // Выводим последовательность операций
        int operations = (n / 2) * (n - (n % 2));
        System.out.println(operations);

        if (rotate.equals("L")) {
            printCounterClockwiseOperations(mat, n);
        } else {
            printClockwiseOperations(mat, n);
        }
    }

    // Поворот матрицы на 90 градусов против часовой стрелки на месте
    private static void rotateCounterClockwise(int[][] mat, int n) {
        transpose(mat, n);
        reverseRows(mat, n);
    }

    // Поворот матрицы на 90 градусов по часовой стрелке на месте
    private static void rotateClockwise(int[][] mat, int n) {
        transpose(mat, n);
        reverseColumns(mat, n);
    }

    // Транспонирование матрицы
    private static void transpose(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    // Реверс строк матрицы
    private static void reverseRows(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = temp;
            }
        }
    }

    // Реверс столбцов матрицы
    private static void reverseColumns(int[][] mat, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - i - 1][j];
                mat[n - i - 1][j] = temp;
            }
        }
    }

    // Вывод последовательности операций для поворота против часовой стрелки
    private static void printCounterClockwiseOperations(int[][] mat, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                System.out.println(i + " " + j + " " + j + " " + (n - i - 1));
                System.out.println(j + " " + (n - i - 1) + " " + (n - i - 1) + " " + i);
                System.out.println((n - i - 1) + " " + i + " " + i + " " + j);
            }
        }
    }

    // Вывод последовательности операций для поворота по часовой стрелке
    private static void printClockwiseOperations(int[][] mat, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                System.out.println(i + " " + j + " " + (n - j - 1) + " " + i);
                System.out.println((n - j - 1) + " " + i + " " + (n - i - 1) + " " + (n - j - 1));
                System.out.println((n - i - 1) + " " + (n - j - 1) + " " + j + " " + (n - i - 1));
            }
        }
    }
}
