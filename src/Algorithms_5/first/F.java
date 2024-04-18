package Algorithms_5.first;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sc.nextInt();
        int temp;
        char[] arr = new char[n-1];
        for (int i = 1; i<n; i++) {
            temp = sc.nextInt();
            if(res%2!=0){
                if (temp%2==0){
                    arr[i-1] = '+';
                    res += temp;
                }
                else{
                    arr[i-1] = 'x';
                    res *= temp;
                }
            }
            else{
                arr[i-1] = '+';
                res+=temp;
            }

        }
        System.out.println(arr);
    }
}
