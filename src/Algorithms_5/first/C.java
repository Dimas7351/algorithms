package Algorithms_5.first;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        long count = 0;
        long ost = 0;
        for (long i: arr){
            ost = i%4;
            if (ost<=2) {
                count += ost;

            }
            else{
                count+=2;
            }
            count+=i/4;
        }
        System.out.println(count);
    }

}
