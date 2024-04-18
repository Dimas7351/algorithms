package Algorithms_5.fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        long[] pref_sum = new long[n];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
        int i = 1;
        arr[0] = Integer.parseInt(tokenizer1.nextToken());
        pref_sum[0]=arr[0];
        while(tokenizer1.hasMoreTokens()){
            arr[i]= Integer.parseInt(tokenizer1.nextToken());
            pref_sum[i]=pref_sum[i-1]+arr[i];
            i++;
        }

        for(int j = 0; j<m; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            search(a,b,arr,pref_sum);
        }

    }

    public static void search(int a, int b, int[]arr, long[]summa){
        int l = 0;
        int r = arr.length-1;
        int mid = (l+r+1)/2;
//        while(l<r){
//            long s = arr[mid]-arr[l];
//            if(s==b)
//                break;
//            else if(s<b)
//                l = mid+1;
//            else
//                r = mid-1;
//            mid = (l+r+1)/2;
//        }
//        while(r-l>=a-1){
//            int r1 = mid+a/2;
//            int l1 = mid-a/2;
//            if(a%2==0){
//                r1--;
//            }
//            else
//                l1++;
//
//            long s =summa[r1]-summa[l1];
//            if(s==b)
//                break;
//            else if(s>b) {
//                if(mid-1-l<a)
//                    r = mid;
//                else
//                    r = mid-1;
//            }
//            else {
//                if(r-mid+1<a)
//                    l = mid;
//                else
//                    l = mid + 1;
//            }
//            mid = (l+r)/2;
//
//        }
        int r1;
        int l1;
        while(r-l>=a){

            if(a%2!=0) {
                r1 = mid + a / 2;
                l1 = mid - a / 2;
            }
            else{
                r1 = mid + (a-1) / 2;
                l1 = mid - (a-1) / 2;
                if(r1+1==arr.length)
                    l1--;
                else
                    r1++;
            }

            long s =summa[r1]-summa[l1];

            if(s==b)
                break;
            else if (s>b)
                r = mid-1;
            else
                l = mid+1;

            mid = (l+r+1)/2;
        }

        System.out.println(l);
        }

}
