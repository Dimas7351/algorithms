package tinkoff_contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {
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

        List<int[][]> result = new ArrayList<>();

        if (rotate.equals("L")) {
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i - 1; j++) {
                    result.add(new int[][]{{i, j}, {j, n - i - 1}});
                    result.add(new int[][]{{j, n - i - 1}, {n - i - 1, n - j - 1}});
                    result.add(new int[][]{{n - i - 1, n - j - 1}, {n - j - 1, i}});
                }
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i - 1; j++) {
                    result.add(new int[][]{{i, j}, {n - j - 1, i}});
                    result.add(new int[][]{{j, n - i - 1}, {n - i - 1, n - j - 1}});
                    result.add(new int[][]{{n - i - 1, n - j - 1}, {n - j - 1, i}});
                }
            }
        }

        System.out.println(result.size());
        for (int[][] item : result) {
            int[] ind1 = item[0];
            int[] ind2 = item[1];
            System.out.println(ind1[0] + " " + ind1[1] + " " + ind2[0] + " " + ind2[1]);
        }
    }
}
