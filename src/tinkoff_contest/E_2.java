package tinkoff_contest;

import java.util.Scanner;

public class E_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] origin_matrix = new String[n];
        for (int i = 0; i < n; i++) {
            origin_matrix[i] = scanner.nextLine();
        }

        int[][] dynamic_matrix = new int[n][3];

        for (int j = 0; j < 3; j++) {
            if (origin_matrix[n - 1].charAt(j) == 'C') {
                dynamic_matrix[n - 1][j] = 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                if (origin_matrix[i].charAt(j) == 'W') {
                    continue;
                }
                
                for (int k = j - 1; k <= j + 1; k++) {
                    if (k >= 0 && k < 3 && origin_matrix[i + 1].charAt(k) != 'W') {
                        int hasMushroom = (origin_matrix[i].charAt(j) == 'C') ? 1 : 0;
                        dynamic_matrix[i][j] = Math.max(dynamic_matrix[i][j], dynamic_matrix[i + 1][k] + hasMushroom);
                    }
                }
            }
        }

        int maxMushrooms = 0;
        for (int j = 0; j < 3; j++) {
            maxMushrooms = Math.max(maxMushrooms, dynamic_matrix[0][j]);
        }

        System.out.println(maxMushrooms);
    }
}
