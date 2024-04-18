package Algorithms_5.second;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<long[],Integer> fin = new TreeMap<>(Collections.reverseOrder((o1, o2) -> {
            if(o1[0]-o1[1]>o2[0]-o2[1])
                return 1;
            else if (o1[0]-o1[1]<o2[0]-o2[1])
                return -1;
            else
                return 0;
        }));
        int n = sc.nextInt();
        int[] ind = new int[n];
        long f_temp;
        long s_temp;
        for(int i = 0; i<n; i++){
            f_temp = sc.nextLong();
            s_temp = sc.nextLong();
            fin.put(new long[]{f_temp, s_temp},i+1);
        }
        long height = 0;

        List<Map.Entry<long[], Integer>> entryList = new ArrayList<>(fin.entrySet());

        // Итерирование по индексам
        boolean flag = true;
        long maxim = 0;
        int max_ind = 0;
        int stop_ind = 0;
        int stop_ind_entry = 0;
        long maxim_true=0;
        int max_list_ind = 0;
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<long[], Integer> entry = entryList.get(i);
//            System.out.println(Arrays.toString(entry.getKey()) + " " + entry.getValue());
            long temp1 = entry.getKey()[0]-entry.getKey()[1];
//            System.out.println(temp1 + " " + height);
            if ((height+temp1<=height || (i==entryList.size()-1 && height+temp1>=height)) && flag){
                if(!(i==entryList.size()-1 && height+temp1>=height))
                    flag = false;
                stop_ind=i;
                stop_ind_entry = entry.getValue();
//                max_ind = entry.getValue();
            }
            if(flag)
                height+=temp1;

            if (entry.getKey()[0]>maxim) {
                    if(flag)
                        maxim_true = entry.getKey()[1];
                    maxim = entry.getKey()[0];
                    max_ind = entry.getValue();
                    max_list_ind=i;
                }

        }
//        System.out.println(entryList.get(stop_ind-1).getKey()[1]);
        if(entryList.get(max_list_ind).getKey()[0]==maxim && entryList.get(max_list_ind).getKey()[1]==maxim_true)
            maxim=maxim_true;
        if(entryList.size()<=1)
            height+=maxim;
        else {
            if ((entryList.get(stop_ind).getKey()[0] + height > height + maxim)) {
                height += entryList.get(stop_ind).getKey()[0];
                max_ind = stop_ind_entry;
            } else
                height += maxim;
        }
        System.out.println(height);

        for(int i : fin.values()){
            if(i!=max_ind){
                if (i==stop_ind_entry) {
                    System.out.print(max_ind + " " + stop_ind_entry + " ");
                }
                else
                    System.out.print(i+" ");
        }}
    }
}
