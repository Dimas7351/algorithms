import java.util.Arrays;

public class Fibonacci {  // Мемоизация - сохранение результатов вычисленных уже значений
    public static void main(String[] args) {
        int n = 100;
        long[] memoization = new long[n+1];

        Arrays.fill(memoization,-1); // Заполняем массив -1

        System.out.println(fibNaive(4,memoization));

    }

        // Наивный и медленный алгоритм, но используем мемоизацию
        // O(2^n) - сложность без мемоизации
        public static long fibNaive(int n, long[] mem){
            if (mem[n] != -1)
                return mem[n];

            if (n<=1)
                return 1;

            long result = fibNaive(n-1,mem)+fibNaive(n-2,mem);
            mem[n] = result;
            return result;
    }

    // O(n)
    private static long  fibEffective(int n){
        // O(n)
        long[] arr = new long[n+1];

        arr[0]=0;
        arr[1]=1;

        // O(n + n) => O(2n) => O(n), т. к. не рассматриваем константу

        for(int i = 2; i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}