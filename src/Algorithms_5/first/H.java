package Algorithms_5.first;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long x1 = sc.nextLong();
        long v1 = sc.nextLong();
        long x2 = sc.nextLong();
        long v2 = sc.nextLong();

        long relative_speed;
        if(v1<=0 && v2>=0 || v1>=0 && v2<=0)
            relative_speed = Math.abs(v1+v2);
        else
            relative_speed = Math.abs(v1-v2);
        long dist = Math.abs(x1-x2);

        double timeToMeet = (double) dist / relative_speed;
//        double halfTime = (double)

        System.out.println(timeToMeet);
    }
}
