package Algorithms_5.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[64];
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        String str;

        for(int i = 0; i<8; i++){
            str = sc.nextLine();
            for(int j = 0; j<8; j++){
                char temp = str.charAt(j);
              if(temp=='*')
                  arr[i*8+j] = 1;
              else {
                  arr[i * 8 + j] = 0;
                  if (temp == 'R')
                      r.add(i*8+j);
                  else if (temp == 'B')
                      b.add(i*8+j);
              }

        }
    }

        for (int s : r){
            int temp = s;
            int row = 0;
            while(temp>=8){
                temp-=8;
                row+=1;
            }
            int k = (s%8);
            int i = row;
            int j = k;

            while(i>=0){
                if(b.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                i--;
            }
            i = row;
            while(i<8){
                if(b.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                i++;
            }
            i = row;
            while(j>=0){
                if(b.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                j--;
            }
            j=k;
            while(j<8){
                if(b.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                j++;
            }


        }

        for (int s : b){
            int temp = s;
            int row = 0;
            while(temp>=8){
                temp-=8;
                row+=1;
            }
            int k = (s%8);
            int i = row;
            int j = k;
            while(j>=0 && i>=0){
                if (r.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                i--;
                j--;
            }
            i = row; j = k;
            while(j>=0 && i<8){
                if (r.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                i++;
                j--;
            }
            i = row; j = k;
            while(j<8 && i>=0){
                if (r.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                i--;
                j++;
            }
            i = row; j = k;
            while(j<8 && i<8){
                if (r.contains(i*8+j))
                    break;
                arr[i*8+j] = 0;
                i++;
                j++;
            }

        }

        int count = 0;
        for (int i = 0; i<64; i++)
            count+=arr[i];

//        for(int i = 0;i<8;i++){
//            for(int j =0; j<8; j++)
//                System.out.print(arr[i*8+j]);
//            System.out.println();
//        }
        System.out.println(count);


}}
