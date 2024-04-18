package Algorithms_1.first;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> fin = new TreeMap<>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        fin.put((a+c)*Math.max(b,d),a+c);
        fin.put((a+d)*Math.max(b,c),a+d);
        fin.put((b+c)*Math.max(a,d),b+c);
        fin.put((b+d)*Math.max(a,c),b+d);
        Map.Entry<Integer, Integer> firstEntry = fin.entrySet().iterator().next();
        System.out.printf("%d %d",firstEntry.getValue(), firstEntry.getKey()/firstEntry.getValue());

    }

}
