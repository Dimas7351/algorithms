package Algorithms_5.fourth;

import java.util.*;

public class C_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // количество полков
        int m = scanner.nextInt(); // количество предстоящих вылазок

        long[] a = new long[n]; // массив с количеством орков в каждом полку
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        // Префиксные суммы для быстрого подсчёта суммарного количества орков
        long[] prefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i - 1];
        }

        // Обработка запросов
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt(); // количество полков для вылазки
            long s = scanner.nextLong(); // суммарное количество орков в этих полках

            int index = findStartingPosition(n, a, prefixSum, s);
            if (index == -1) {
                System.out.println(-1);
            } else {
                System.out.println(index + 1); // учитываем, что массивы в Java индексируются с 0
            }
        }
    }

    // Функция для поиска начальной позиции полков для вылазки
    private static int findStartingPosition(int n, long[] a, long[] prefixSum, long s) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            long sumOrcs = prefixSum[mid + 1] - prefixSum[0] - (mid + 1) * a[0] + a[mid] * (mid + 1);
            if (sumOrcs == s) {
                return mid;
            } else if (sumOrcs < s) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
