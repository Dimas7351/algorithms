package Algorithms_5.third;

import java.io.*;
import java.util.*;

public class F_hash {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/dimas735/26 (5)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader(file));
        Map<Character, ArrayList<String>> hash = new HashMap<>();
        ArrayList<String> fin = new ArrayList<>();
        StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
        while(tokenizer1.hasMoreTokens()){
            boolean flag = true;
            String word = tokenizer1.nextToken();
            char firstChar = word.charAt(0);
            if (!hash.containsKey(firstChar)) {
                // Если нет, создаем новый массив строк
                hash.put(firstChar, new ArrayList<>());
            }
            // Добавляем текущее слово в массив соответствующего символа

            for (String c : hash.get(firstChar)){
                if(word.startsWith(c)){
                    flag=false;
                    break;
                }
            }
            if(flag)
                hash.get(firstChar).add(word);
        }

        for(Map.Entry<Character, ArrayList<String>> entry : hash.entrySet()){
            entry.getValue().sort(Comparator.comparingInt(String::length));
        }

        StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while(tokenizer2.hasMoreTokens()) {
            String word = tokenizer2.nextToken();
            char firstChar = word.charAt(0);
            boolean flag = true;
//            String temp = "";
            if(hash.containsKey(firstChar)){
//                temp = hash.get(firstChar).get(0);
                for(String c : hash.get(firstChar)){
                    if (word.startsWith(c)){
                        flag=false;
                        writer.write(c + " ");
                        break;
                    }
                }
            }
            if(flag)
                writer.write(word + " ");
//            if(flag)
//                writer.write(temp + " ");
//            else
//                writer.write(word + " ");
        }
        writer.close();
    }
}
