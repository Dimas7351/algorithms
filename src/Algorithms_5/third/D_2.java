package Algorithms_5.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
//        long[] okno = new long[k];
        long[] arr = new long[n];
        List<Long> tir = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i<n;i++){
            arr[i] = Long.parseLong(tokenizer.nextToken());
        }
        if(n==1)
            tir.add(arr[0]);
        else {
            for (int i = 0; i < k; i++)
//            okno[i] = arr[i];
                tir.add(arr[i + 1]);
        }
        boolean flag = false;
        for(int i = 0; i<n-k; i++){
            if (tir.contains(arr[i])) {
                flag = true;
                break;
            }
            if(i!=n-k-1)
                tir.add(arr[i+k+1]);
            tir.remove(0);
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
