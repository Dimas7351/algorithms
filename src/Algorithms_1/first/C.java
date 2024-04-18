package Algorithms_1.first;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phone1 = sc.nextLine();
        String phone2 = sc.nextLine();
        String phone3 = sc.nextLine();
        String phone4 = sc.nextLine();

        phone1 = phone1.replaceAll("[^\\d]","");
        phone2 = phone2.replaceAll("[^\\d]","");
        phone3 = phone3.replaceAll("[^\\d]","");
        phone4 = phone4.replaceAll("[^\\d]","");

        String[] check = {phone2,phone3,phone4};
        boolean first = phone1.length()==11;
        for (String s : check){
            boolean ch = true;
            if(first){
                if(s.length()==11){
                    if(!(s.substring(1).equals(phone1.substring(1))))
                        ch=false;
                }
                else{
                    if(!(s.equals(phone1.substring(4)) && phone1.startsWith("495", 1)))
                        ch=false;
                }
            }
            else{
                if(s.length()==11){
                    if(!(s.substring(4).equals(phone1) && s.startsWith("495",1)))
                        ch=false;
                }
                else{
                    if(!(s.equals(phone1)))
                        ch=false;
                }
            }
            if(ch)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
