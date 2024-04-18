package handbook.three_third;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[][] mat = new String[n][m];
        mat[0][0] = "L";
        for(int j = 1; j<m; j++){
            if (j%3==0){
                int temp_i = 0;
                int temp_j = j;
                while(temp_j<m && temp_i<n){
                    mat[temp_i][temp_j] = "L";
                    temp_j++;
                    temp_i++;
                }
            }
            else {
                int temp_i = 0;
                int temp_j = j;
                while(temp_j<m && temp_i<n){
                    mat[temp_i][temp_j] = "W";
                    temp_j++;
                    temp_i++;
                }
            }
        }

        for(int i = 0; i<n; i++){
            if (i%3==0){
                int temp_i = i;
                int temp_j = 0;
                while(temp_j<m && temp_i<n){
                    mat[temp_i][temp_j] = "L";
                    temp_j++;
                    temp_i++;
                }
            }
            else {
                int temp_i = i;
                int temp_j = 0;
                while(temp_j<m && temp_i<n){
                    mat[temp_i][temp_j] = "W";
                    temp_j++;
                    temp_i++;
                }
            }
        }

        if(mat[n-1][m-1].equals("L"))
            System.out.println("Loose");
        else
            System.out.println("Win");

//        for(int i = 0; i<n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
