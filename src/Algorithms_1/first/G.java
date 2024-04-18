package Algorithms_1.first;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int ost_n;
        int k_amount;
        int ost_k;
        int k_kol;
        int m_inner;
        int m_amount;
        int total_ost = n;
        int count = 0;

        if (k==0 || m==0)
            System.out.println(0);
        else{
        while(total_ost>=k) {
            ost_n = total_ost % k; // Сколько кг осталось от сплава
            k_amount = total_ost /= k; // Количество заготовок
            m_inner = k / m; // Количество деталей в одной заготовке
            m_amount = m_inner * k_amount; // Количество деталей
            count += m_amount; //2
            ost_k = k_amount * (per(k,(m_inner * m)));
            total_ost = ost_n + ost_k;
        }

        System.out.println(count);
    }}
    public static int per(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a % b;
    }


}
