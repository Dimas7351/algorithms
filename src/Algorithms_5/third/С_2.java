package Algorithms_5.third;

import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class С_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<Integer, Integer> mm = new TreeMap();
        int temp = 0;
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i<n; i++){
            temp = Integer.parseInt(tokenizer.nextToken());
            if(mm.containsKey(temp))
                mm.put(temp,mm.get(temp)+1);
            else
                mm.put(temp,1);
        }

        int tt = 0;
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(mm.entrySet());
        int co = entryList.get(0).getValue();
        for(int i = 0; i<entryList.size()-1; i++){
            if(entryList.get(i+1).getKey() - entryList.get(i).getKey() == 1) {
                tt = entryList.get(i + 1).getValue() + entryList.get(i).getValue();
                if(tt>co)
                    co=tt;
            }
        }
        if(n==1)
            System.out.println(0);
        else
            System.out.println(n-co);
    }
}
