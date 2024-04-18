package Algorithms_5.second;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        int maxim = arr[0];
        int summa = maxim;
        for(int i = 1; i<n; i++){
            arr[i] = sc.nextInt();
            summa+=arr[i];
            if (arr[i] > maxim){
                maxim = arr[i];
            }
        }
        if(summa-maxim<maxim)
            System.out.println(maxim-(summa-maxim));
        else
            System.out.println(summa);
    }
}
