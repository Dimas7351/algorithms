package Algorithms_5.first;

import java.util.*;
import java.util.stream.Stream;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int year = Integer.parseInt(sc.nextLine());
//        Map<Integer, String> holidays = new LinkedHashMap<>();
        String[] holidays = new String[n];
        Map<String, Integer> months = new LinkedHashMap<>();
        months.put("January",0);
        months.put("February",31);
        if(check_vis(year))
            months.put("March",months.get("February")+29);
        else
            months.put("March",months.get("February")+28);
        months.put("April",months.get("March")+31);
        months.put("May",months.get("April")+30);
        months.put("June",months.get("May")+31);
        months.put("July",months.get("June")+30);
        months.put("August",months.get("July")+31);
        months.put("September",months.get("August")+31);
        months.put("October",months.get("September")+30);
        months.put("November",months.get("October")+31);
        months.put("December",months.get("November")+30);


        for(int i = 0; i<n; i++){
//            holidays.put(Integer.parseInt(temp.split(" ")[0]),temp.split(" ")[1]);
            holidays[i] = sc.nextLine();
            // Одинаковые числа, но разные месяцы не работают
        }
        String start = sc.nextLine();
        Map<Integer, String> days = new LinkedHashMap<>();
        String[] ddd = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int y = 0;
        for (; y<7; y++){
            if (ddd[y].equals(start)){
                break;
            }
        }
        for(int j = 0; j<7; j++) {
            days.put(j+1, ddd[y]);
            if(y==6)
                y=0;
            else
                y+=1;
        }


        int[] hol = new int[n];
        Map<String, Integer> fin = new LinkedHashMap<>();

        String[] iu = new String[2];
        for(String temp : ddd)
            fin.put(temp,52);




        for(int i = 0; i<n; i++){
            hol[i] = Integer.parseInt(holidays[i].split(" ")[0])+months.get(holidays[i].split(" ")[1]);
            }

        String temp;
        for(int u : hol){
            if (u%7==0)
                temp = days.get(7);
            else
                temp = days.get(u%7);
            fin.put(temp, fin.get(temp) - 1);
        }

        for (String day : ddd){
            fin.put(day,fin.get(day)+n);
        }


        fin.put(start,fin.get(start)+1);
        if (check_vis(year)) {
            fin.put(days.get(366 % 7), fin.get(days.get(366 % 7)) + 1);
        }


        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(fin.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }

        });

//        for (int a = 0; a<7; a++)
//            System.out.println(entryList.get(a));


            System.out.println(entryList.get(6).getKey()+ " " + entryList.get(0).getKey());



    }






    public static boolean check_vis(int year){
        return year%400==0 || year%4==0 && year%100!=0;
    }
}
