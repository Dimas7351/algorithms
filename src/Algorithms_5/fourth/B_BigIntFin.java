package Algorithms_5.fourth;

import java.math.BigInteger;
import java.util.Scanner;

public class B_BigIntFin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        BigInteger l = BigInteger.valueOf(0);
        BigInteger r = n;
        if(n.compareTo(BigInteger.valueOf(1))==0)
            System.out.println(1);
        else {
            while (l.compareTo(r) < 0) {
                BigInteger mid = (l.add(r).add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
                if (check(mid, n)<=0)
                    l = mid;
                else
                    r = mid.subtract(BigInteger.valueOf(1));
            }
            System.out.println(l);
        }
    }
    public static int check(BigInteger k, BigInteger n) {
        BigInteger ans = k.multiply(k.add(BigInteger.valueOf(1))).multiply(k.add(BigInteger.valueOf(2))).divide(BigInteger.valueOf(6));
        ans = ans.add((k.multiply(k.add(BigInteger.valueOf(1)))).divide(BigInteger.valueOf(2))).subtract(BigInteger.valueOf(1));
        return ans.compareTo(n);
    }
}
