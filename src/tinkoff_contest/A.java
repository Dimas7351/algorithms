package tinkoff_contest;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count_fives = 0;
        int low_marks = 0;
        int max_fives = -1;
        int start = 0;

        for (int end = 0; end < n; end++) {
            if (arr[end] == 5) {
                count_fives++;
            } else if (arr[end] <= 3) {
                low_marks++;
            }

            while (end - start + 1 > 7) {
                if (arr[start] <= 3) {
                    low_marks--;
                } else if (arr[start] == 5) {
                    count_fives--;
                }

                start++;
            }

            if (low_marks == 0 && end - start + 1 == 7) {
                max_fives = Math.max(count_fives, max_fives);
            }
        }

        System.out.println(max_fives);
    }
}
