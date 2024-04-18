package tinkoff_contest;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int [][] origin_matrix = new int[n][3];
        int [][] dynamic_matrix = new int[n][3];

        for(int i = 0; i<n; i++){
            char[] row = sc.nextLine().toCharArray();
            for (int j = 0; j<3; j++){
                dynamic_matrix[i][j] = -1;

                if (row[j]=='W')
                    origin_matrix[i][j]=-1;
                if (row[j]=='.')
                    origin_matrix[i][j]=0;
                if (row[j]=='C')
                    origin_matrix[i][j]=1;
            }
        }

        System.arraycopy(origin_matrix[0], 0, dynamic_matrix[0], 0, 3);

        for (int i = 1; i<n; i++){
            for (int j = 0; j<3; j++){
                for (int dj = -1; dj<=1; dj++){
                    if (j+dj >=0 && j+dj<3 && dynamic_matrix[i-1][j+dj] != -1 && origin_matrix[i][j] != -1)
                        dynamic_matrix[i][j] = max(dynamic_matrix[i][j], dynamic_matrix[i-1][j+dj] + origin_matrix[i][j]);
                }
            }
        }

        int max_c = 0;

        for(int i = 0; i<n; i++){
            for (int j = 0; j<3; j++){
                max_c = max(max_c, dynamic_matrix[i][j]);
            }
        }

        System.out.println(max_c);

    }
}
