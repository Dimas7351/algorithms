package Algorithms_1.first;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (c<0)
            System.out.println("NO SOLUTION");
        else{
            if (a==0){
                if(b<0)
                    System.out.println("NO SOLUTION");
                else if(Math.sqrt(b)==c)
                    System.out.println("MANY SOLUTIONS");
                else
                    System.out.println("NO SOLUTION");
            }
            else{
                double result = (double) (c * c - b) /a;
                if ((double)result != (int)result)
                    System.out.println("NO SOLUTION");
                else
                    System.out.println((int)result);
        }}
    }
}
