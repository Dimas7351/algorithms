package handbook.three_first;

import java.util.Scanner;

// Сочетания
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(fact(n)/(fact(k)*fact(n-k)));
    }
    public static int fact(int n){
        int c = 1;
        for(int i = 1; i<=n; i++)
            c*=i;
        return c;
    }
}
