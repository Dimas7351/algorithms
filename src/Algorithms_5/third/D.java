package Algorithms_5.third;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class D {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/dimas735/17 (2)");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        HashSet<Long> heh = new HashSet<>();
//        int[] okno = new int[k];
        long[] arr = new long[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        long tt = 0;
        for(int i = 0; i<n;i++){
            tt = Long.parseLong(tokenizer.nextToken());
            arr[i] = tt;
            heh.add(tt);
        }
        if((n==k && heh.size()!=k) || heh.size()==n )
            System.out.println("NO");
        else {
            boolean flag = false;
            for (int i = 0; i < n - k; i++) {
                for (int j = 1; j <= k; j++) {
                    if (arr[i] == arr[j + i]) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
