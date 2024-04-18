package Algorithms_5.third;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int minim = sc.nextInt();
        arr[0] = minim;
        for (int i = 1; i<n; i++){
            arr[i] = sc.nextInt();
            if (arr[i]<minim)
                minim = arr[i];
        }
        int co = 0;
        for(int i = 0; i<n; i++){
            if (arr[i]-minim>1)
                co++;
            else
                System.out.println(arr[i]);
        }
        System.out.println(minim);
        System.out.println(co);
    }
}
