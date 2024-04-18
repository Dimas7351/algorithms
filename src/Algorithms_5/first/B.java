package Algorithms_5.first;


import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int where = sc.nextInt();
//        String[] array1 = (input1).split(":");
//        String[] array2 = (input2).split(":");
//        String[] fin = Arrays.copyOf(array1, array1.length + array2.length);
//        System.arraycopy(array2, 0, fin, array1.length, array2.length);
        String[] ahh = (input1+":"+input2).split(":");
        int [] fin = new int[4];
        for (int i = 0; i<4;i++)
            fin[i] = Integer.parseInt(ahh[i]);
        int team_1 = fin[0]+fin[2];
        int team_2 = fin[1]+fin[3];
        int dev = team_1-team_2;
        if (dev>0)
            System.out.println(0);
        else if(dev == 0){
            if (where == 2 && fin[0]>fin[3] || where ==1 && fin[2]>fin[1])
                System.out.println(0);
            else
                System.out.println(1);
        }
        else{
            if(where == 1){
                if(fin[2]+Math.abs(dev)<=fin[1])
                    System.out.println(Math.abs(dev)+1);
                else
                    System.out.println(Math.abs(dev));
            }
            else{
                if(fin[0]>fin[3])
                    System.out.println(Math.abs(dev));
                else
                    System.out.println(Math.abs(dev)+1);
            }}
    }
}
