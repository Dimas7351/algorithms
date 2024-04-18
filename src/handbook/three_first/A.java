package handbook.three_first;

import java.util.Scanner;

// Число перестановок
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int co = 1;
        for(int i = 1; i<=n; i++)
            co*=i;
        System.out.println(co);
    }
}
