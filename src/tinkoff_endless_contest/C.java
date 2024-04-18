package tinkoff_endless_contest;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int emp = sc.nextInt();

        if(arr[emp-1]-arr[0]<=t)
            System.out.println((arr[arr.length-1]-arr[0]));
        else
            System.out.println(arr[emp-1]-arr[0]+ (arr[arr.length-1]-arr[0]));
    }
}
