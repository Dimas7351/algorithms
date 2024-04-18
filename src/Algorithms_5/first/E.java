package Algorithms_5.first;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        int d = sc.nextInt();
        String temp_str;

            temp_str = Long.toString(n);
            n = add(temp_str,k);
            if (n==-1)
                System.out.println(-1);
            else {
                temp_str = Long.toString(n);
                temp_str += "0".repeat(d - 1);
                System.out.println(temp_str);
            }

    }
    public static long add (String temp, long k){
        String f;
        long tt;
        long result = -1;
        for (int i = 0; i<9; i++){
            f = temp+i;
            tt = Long.parseLong(f);
            if (per(tt,k)==0){
                result = tt;
                break;
        }}
        return result;
    }
    public static long per(long a, long b) {
        if (b == 0) {
            return 0;
        }
        return a % b;
    }

}
