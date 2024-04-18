package tinkoff_endless_contest;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a;
        if(d>b)
            sum+=(d-b)*c;
        System.out.println(sum);
    }
}
