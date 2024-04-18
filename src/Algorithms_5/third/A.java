package Algorithms_5.third;

import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args) throws IOException {
//        long start = System.currentTimeMillis();
        File file = new File("/home/dimas735/21");
//        Scanner sc = new Scanner(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = 0;
        String temp = "";
//        Map<String, Integer> mapping = new HashMap<>();
        Map<String, Integer> mapping = new TreeMap<>();
        ArrayList<String> fin = new ArrayList<>();
        int maxim = 0;
        for (int i = 0; i<n; i++){
            k = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for(int j = 0; j<k; j++){
                temp = tokenizer.nextToken();
                if(mapping.containsKey(temp))
                    mapping.put(temp,mapping.get(temp)+1);
                else
                    mapping.put(temp,1);
                if(mapping.get(temp)>maxim)
                    maxim = mapping.get(temp);
            }
        }
        int co = 0;
        for (Map.Entry<String, Integer> entry : mapping.entrySet()){
            if (entry.getValue()==maxim){
                co++;
                fin.add(entry.getKey());
            }
        }
//        fin.sort(Comparator.naturalOrder());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        if(maxim!=n)
            System.out.println(0);
        else {
            System.out.println(co);
            for (String s : fin)
                writer.write(s + " ");
        }


////        System.out.println();
//        writer.write("");
//        // Измерение памяти
//        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
//        writer.write(Long.toString(usedBytes/1048576)+'\n');
////        System.out.println(usedBytes/1048576);
//        long finish = System.currentTimeMillis();
//        long elapsed = finish - start;
//        writer.write(Double.toString(elapsed));
////        System.out.println("Прошло времени, мс: " + elapsed);
        writer.close();
    }

}
