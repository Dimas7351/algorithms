package Algorithms_1.first;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.nextLine();

    String mode = sc.nextLine();

    switch (mode){
        case "fan":
            System.out.println(a);
            break;
        case "auto":
            System.out.println(b);
            break;
        case "heat":
            if (a<=b)
                System.out.println(b);
            else
                System.out.println(a);
            break;
        case "freeze":
            if (a>=b)
                System.out.println(b);
            else
                System.out.println(a);
            break;
    }

}}
