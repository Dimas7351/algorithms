package Algorithms_5.third;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> dic = new ArrayList<>();
        ArrayList<String> text = new ArrayList<>();
        ArrayList<String> fin = new ArrayList<>();

        StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
        while(tokenizer1.hasMoreTokens())
            dic.add(tokenizer1.nextToken());

        StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
        while(tokenizer2.hasMoreTokens())
            text.add(tokenizer2.nextToken());

        dic.sort(Comparator.comparingInt(String::length));

        boolean flag;
        for(String t : text){
            flag = true;
            for (String d : dic) {
                if (t.startsWith(d)) {
                    fin.add(d);
                    flag = false;
                    break;
                }
            }
            if(flag){
                fin.add(t);
        }}
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String ls : fin)
            writer.write(ls + " ");
        writer.close();
    }
}

