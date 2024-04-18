package tinkoff_endless_contest;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int inc_chet = 0;
        int inc_nechet = 0;
        int chet_index = 0;
        int nechet_index = 0;
        for(int i = 1; i<=n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%2!=i%2 && arr[i]%2==0){
                inc_chet++;
                chet_index=i;
            }
            else if (arr[i]%2!=i%2 && arr[i]%2!=0) {
                inc_nechet++;
                nechet_index=i;
            }
        }
        if (inc_chet==inc_nechet && inc_chet==1){
            System.out.println(min(chet_index,nechet_index) + " " +max(chet_index,nechet_index));
        }
        else
            System.out.println(-1 + " " +-1);

        System.out.println(Arrays.toString(arr));
    }
}
