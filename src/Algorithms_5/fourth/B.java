package Algorithms_5.fourth;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long l = 0;
        long r = n;
        if(n==1)
            System.out.println(1);
        else {
            while (l < r) {
                long mid = (l + r + 1) / 2;
                if (check(mid, n))
                    l = mid;
                else
                    r = mid-1;
            }
            System.out.println(l);
        }
    }
    public static boolean check(long k, long n){
        long ans = (k*(k+1)*(k+2))/6 + ((k+1)*k)/2 -1;
        return ans <= n;
    }
}
