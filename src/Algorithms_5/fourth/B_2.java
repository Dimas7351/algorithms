package Algorithms_5.fourth;

import java.util.Scanner;

public class B_2 {
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
        long co = k/2;
        long ans = (co*(co+1)*k)/2-((co-1)*co*(co+1))/6;
        ans*=2;
//        if(k%2==0){
//        while(temp>0){
//            ans+=ans+temp;
//            temp-=2;
//            co++;
//        }
//        ans*=2;
//        co*=2;
//        }
//        else{
//            while(temp>1){
//                ans+=ans+temp;
//                temp-=2;
//                co++;
//            }
//            ans*=2;
//            ans+=ans+temp;
//            co*=2;
//            co++;
//        }
//        ans--;
        ans+=co;
        ans-=1;
        System.out.println(ans);
        return ans <= n;
    }
}
