package Algorithms_5.fourth;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

public class E_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = (long) ceil((-1+sqrt(1+8*n))/2);
        long pre_k = n-k*(k-1)/2;
        long nominator = 0;
        long denominator = 0;
        if(k%2==0){
            nominator=k-(pre_k-1);
            denominator=pre_k;
        }
        else{
            denominator=k-(pre_k-1);
            nominator=pre_k;
        }
        if(denominator==0)
            denominator=1;
        if(nominator==0)
            nominator=1;
        System.out.println(nominator+"/"+denominator);
    }
}
