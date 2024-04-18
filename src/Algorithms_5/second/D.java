package Algorithms_5.second;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i_temp;
        int j_temp;

        int[] di = {-1,0,1,0};
        int[] dj = {0,1,0,-1};

        int[][] arr = new int[10][10];
        for(int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                if(i==0 || j==0 || i==9 || j==9)
                    arr[i][j]=-1;
                else
                    arr[i][j]=0;
            }
        }
        for (int i = 0; i<n;i++){
            i_temp = sc.nextInt();
            j_temp = sc.nextInt();
            arr[i_temp][j_temp] = 1;
        }

        int neig = 0;
        for(int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                if(arr[i][j]==1){
                    for(int k = 0; k<4; k++)
                        if(arr[i+di[k]][j+dj[k]]==1)
                            neig+=1;
                }
            }
        }
        System.out.println(n*4-neig);
    }
}
