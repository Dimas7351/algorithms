package Algorithms_5.first;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int v = sc.nextInt();
        int q = sc.nextInt();
        int m = sc.nextInt();

        int p_v = p-v;
        int p__v = p+v;
        int q_m = q-m;
        int q__m = q+m;

       // check(p,v,q,m);

        int max_start = Math.max(p-v,q-m);
        int min_end = Math.min(p+v,q+m);

        if(min_end>=max_start)
            System.out.println(2*v+2*m+2-(min_end-max_start)-1);
        else
            System.out.println(2*v+2*m+2);

//        if (q>=p){
//            if (q_m>p__v)
//                System.out.println(2*v+2*m+2);
//            else{
//                System.out.println(p__v-q_m+1+2*v+2*m);
//            }
//        }
//        else{
//            if (p_v>q__m)
//                System.out.println(2*v+2*m+2);
//            else
//                System.out.println(2*v+2*m+2);
//        }
  }

  public static void check(int p, int v, int q, int m){
    Set<Integer> set1 = new TreeSet<>();
    Set<Integer> set2 = new TreeSet<>();


        for(int i = p-v;i<=p+v;i++)
            set1.add(i);
        for(int i = q-m;i<=q+m;i++)
            set2.add(i);

        Set<Integer> fin = new TreeSet<>(set1);
        fin.addAll(set2);


        System.out.println(fin.size());
      System.out.println(set1);
      System.out.println(set2);
      System.out.println(fin);
    }
}
