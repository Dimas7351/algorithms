package Algorithms_5.third;

import Algorithms_5.first.I;

import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class A_2 {
    public static void main(String[] args) throws IOException {
//        long start = System.currentTimeMillis();
//        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = 0;
        String temp = "";
        Set<String> setick = new TreeSet<>();
        k = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int j = 0; j<k; j++) {
            temp = tokenizer.nextToken();
            setick.add(temp);
        }
        for (int i = 1; i<n; i++){
            Set<String> temp_set = new TreeSet<>();
            k = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
            for(int j = 0; j<k; j++) {
                temp = tokenizer1.nextToken();
                temp_set.add(temp);
            }
            setick.retainAll(temp_set);
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println(setick.size());
        for (String s : setick)
            writer.write(s + " ");

        writer.close();

//        System.out.println();
//        // Измерение памяти
//        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
//        System.out.println(usedBytes/1048576);
//        long finish = System.currentTimeMillis();
//        long elapsed = finish - start;
//        System.out.println("Прошло времени, мс: " + elapsed);
    }
}
