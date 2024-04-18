package Algorithms_5.second;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];

        for(int i = 0; i<n; i++)
            arr[i] = sc.nextLong();

        long total_sum = 0;
        for (int i = 0; i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(j-i>k)
                    break;
                if (arr[j]-arr[i] > total_sum)
                    total_sum=arr[j]-arr[i];
            }
        }
        System.out.println(total_sum);
    }
}
