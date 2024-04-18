package Algorithms_5.second;

import java.util.Arrays;
import java.util.Scanner;



public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long temp;
        for(int i = 0; i<n*2; i++){
            temp = sc.nextLong();
            if(i%2==0)
                x[i/2]=temp;
            else
                y[i/2]=temp;
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(x[0]+" "+y[0]+ " " +x[n-1] + " "+ y[n-1]);


    }
}
