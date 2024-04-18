package tinkoff_contest;

import java.util.Scanner;

import static java.lang.Math.max;

public class A_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i<n; i++)
            marks[i] = sc.nextInt();

        int max_fives = -1;
        for(int i = 6; i<n; i++){
            boolean low_mark = false;
            int count_fives = 0;
            for(int j = 0; j<7; j++){
                if(marks[i-j]<=3){
                    low_mark = true;
                    break;
                }
                if (marks[i-j]==5)
                    count_fives++;
            }
            if (!low_mark)
                max_fives = max(max_fives, count_fives);
        }
        System.out.println(max_fives);
    }
}
