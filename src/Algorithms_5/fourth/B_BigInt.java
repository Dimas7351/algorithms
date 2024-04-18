package Algorithms_5.fourth;

import java.math.BigInteger;
import java.util.Scanner;

public class B_BigInt {
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
    public static int check(BigInteger k, BigInteger n){
        BigInteger co = BigInteger.valueOf(0);
        BigInteger ans = BigInteger.valueOf(0);
        BigInteger i = BigInteger.valueOf(1);
        co = k.divide(BigInteger.valueOf(2));
//        while(co.compareTo(k)<0){
        while(i.compareTo(co)<=0){
            ans = ans.add(i.multiply(k.subtract(i.subtract(BigInteger.valueOf(1)))));
//            ans = ans.add(co.add(BigInteger.valueOf(1)).multiply(k.subtract(co)).add(co.add(BigInteger.valueOf(1))));
//            co = co.add(BigInteger.valueOf(1));
            i = i.add(BigInteger.valueOf(1));
        }
        ans = ans.multiply(BigInteger.valueOf(2));
        if((k.remainder(BigInteger.valueOf(2))).compareTo(BigInteger.valueOf(0))>0)
            ans = ans.add(i.multiply(k.subtract(i.subtract(BigInteger.valueOf(1)))));
        BigInteger kk = k.multiply(k.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
        ans = ans.subtract(BigInteger.valueOf(1)).add(kk);
        return ans.compareTo(n);
    }
}
