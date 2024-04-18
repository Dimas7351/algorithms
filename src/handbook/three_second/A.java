package handbook.three_second;

import java.util.Arrays;
import java.util.Scanner;

// Чемпионский отрезок, пересекающиеся отрезки
public class A {

    static class Pair implements Comparable<Pair>{
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }

        @Override
        public int compareTo(Pair o) {
            if (this.second>o.second)
                return 1;
            else if(this.second<o.second)
                return -1;
            else
                return 0;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] lines = new Pair[n];
        for (int i = 0; i<n; i++){
            int f = sc.nextInt();
            int s = sc.nextInt();
            lines[i] = new Pair(f,s);
        }

        Arrays.sort(lines);


        for (int i = 0; i<n-1; i++){
            int l = lines[i].first;
            int r = lines[i].second;
            if (l != -1 && r !=-1){
                for (int j = i+1; j<n; j++){
                    int l_temp = lines[j].first;
                    if(l_temp<=r){
                        lines[j].first = -1;
                        lines[j].second = -1;
                    }
                }
            }
        }

        int co = 0;
        for (int i = 0; i<n; i++){
            if (lines[i].first!=-1)
                co++;
        }
        System.out.println(co);
    }
}
