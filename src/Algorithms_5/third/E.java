package Algorithms_5.third;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Long> set1 = new HashSet<>();
        Set<Long> set2 = new HashSet<>();
        Set<Long> set3 = new HashSet<>();
        int n1 = sc.nextInt();
        long temp = 0;
        for(int j = 0; j<n1; j++){
            temp = sc.nextLong();
            set1.add(temp);
        }
        int n2 = sc.nextInt();
        for(int j = 0; j<n2; j++){
            temp = sc.nextLong();
            set2.add(temp);
        }
        int n3 = sc.nextInt();
        for(int j = 0; j<n3; j++){
            temp = sc.nextLong();
            set3.add(temp);
        }
        Set<Long> set1_temp = new TreeSet<>(set1);
        Set<Long> set2_temp = new TreeSet<>(set2);
        Set<Long> set3_temp = new TreeSet<>(set3);

        set1_temp.retainAll(set2);
        set2_temp.retainAll(set3);
        set3_temp.retainAll(set1);

        set1_temp.addAll(set2_temp);
        set1_temp.addAll(set3_temp);

        for(long s : set1_temp)
            System.out.print(s+" ");
    }
}
