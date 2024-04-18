package tinkoff_contest;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[][] origin_matrix = new long[n][m];

        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                origin_matrix[i][j] = sc.nextInt();
            }
        }

        long[][] rotated_matrix = new long[m][n];

        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                rotated_matrix[j][n-i-1] = origin_matrix[i][j];
            }
        }

        for(int i = 0; i<m; i++){
            for(int j=0; j<n-1; j++){
                System.out.print(rotated_matrix[i][j] + " ");
            }
            System.out.println(rotated_matrix[i][n-1]);
        }
    }
}
