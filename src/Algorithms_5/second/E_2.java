package Algorithms_5.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] big = new long[n];
        List<Long> big2 = new ArrayList<>();
        long[] small = new long[n];

        List<Integer> maxim = new ArrayList<>();
        List<Integer> minim = new ArrayList<>();

        int maxim_ind = 0;
        int minim_ind = 0;

        long max = 0;
        long max_in_min = 0;
        int max_ind;
        long height = 0;

        for (int i = 0; i<n; i++){
            big[i] = sc.nextInt();
            small[i] = sc.nextInt();
            if(big[i]>max){
                max = big[i];
                max_ind=i;
            }
            if(big[i]-small[i]>=0) {
                height+=big[i]-small[i];
                maxim.add(i+1);
            }
            else{
                minim.add(i+1);
            }
        }
        System.out.println(Arrays.toString(big));
        System.out.println(Arrays.toString(small));
        System.out.println(maxim);
        System.out.println(minim);
        System.out.println(maxim_ind);

    }
}
