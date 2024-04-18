package Algorithms_5.fourth;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.*;

public class Е {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        BigInteger two = BigInteger.valueOf(2);
        BigInteger eight = BigInteger.valueOf(8);
        BigInteger one = BigInteger.ONE;
        BigInteger sqrtArg = one.add(eight.multiply(n)).sqrt();
        BigInteger k = (sqrtArg.subtract(one)).divide(two);
        BigInteger pre_k = n.subtract(k.multiply(k.subtract(one)).divide(two));

        BigInteger nominator;
        BigInteger denominator;
        BigInteger subtract = k.subtract(pre_k.subtract(one));

        if (k.remainder(two).equals(BigInteger.ZERO)) {
            nominator = subtract;
            denominator = pre_k;
        } else {
            denominator = subtract;
            nominator = pre_k;
        }

        if(denominator.equals(BigInteger.valueOf(0)))
            denominator=BigInteger.valueOf(1);
        System.out.println(nominator + "/" + denominator);
    }
}

