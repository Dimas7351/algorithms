package Algorithms_5.fourth;


import java.io.*;
import java.util.*;


public class A {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
//        File file = new File("/home/dimas735/013");
//        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        long[] arr = new long[n];
        StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
        while(tokenizer1.hasMoreTokens()){
            arr[count]= Long.parseLong(tokenizer1.nextToken());
            count++;
        }
        Arrays.sort(arr);
        int k = Integer.parseInt(reader.readLine());
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<k; i++){
            StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
            long a = Long.parseLong(tokenizer2.nextToken());
            long b = Long.parseLong(tokenizer2.nextToken());
            int r_temp = right_digits_inside_binary(b,arr);
            int l_temp = left_digits_inside_binary(a,arr);
            int ans = r_temp-l_temp;
            if(arr[r_temp]<=b && arr[l_temp]>=a)
                ans++;
            else if (arr[r_temp]>b && arr[l_temp]<a)
                ans--;
            if(ans<0)
                ans = 0;
            sb.append(ans).append(" ");
        }
        writer.write(String.valueOf(sb));
//        long finish = System.currentTimeMillis();
//        System.out.println();
//        System.out.println();
//        System.out.println(finish-start);
        writer.close();
    }

    public static int left_digits_inside_binary(long target, long[] arr){
        int l = 0;
        if(arr[l]>=target)
            return l;
        else {
            int r = arr.length - 1;
            while(l<r){
                int mid = (l+r+1)/2;
                if(arr[mid]>target)
                    r = mid-1;
                else
                    l = mid;
            }
        if(l-1>=0 && arr[l]==target) {
            while (l >= 1 && arr[l - 1] == arr[l])
                l--;
        }
        }return l;
    }

    public static int right_digits_inside_binary(long target, long[] arr){
        int l = 0;
        int r = arr.length-1;
        if(arr[r]<=target)
            return r;
        else {
            while(l<r){
                int mid = (l+r)/2;
                if(arr[mid]>=target)
                    r = mid;
                else
                    l = mid+1;
            }
            if(l+1<=arr.length-1 && arr[l]==target) {
                while (l + 1 <= arr.length - 1 && arr[l + 1] == arr[l])
                    l++;
            }
            return l;
        }
    }
}
