package Algorithms_5.third;

import java.util.HashMap;
import java.util.Scanner;

public class D_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();

        boolean flag = true;
        int temp = 0;
        for (int i = 0; i<n; i++){
            temp = sc.nextInt();
            if (map.containsKey(temp)){
                if(i-map.get(temp)<=k){
                    flag = false;
                    System.out.println("YES");
                    break;
                }
            }
            map.put(temp,i);
        }
        if(flag)
            System.out.println("NO");

    }
}
