package tinkoff_contest;


import java.util.Arrays;

class Solution{
    public static String [] solve(String [] arr){
        int n = arr.length;
        String[] new_arr = new String[n];
        int k = 0;
        String side1 = "";
        for(int i = n-1; i>=0; i--){
            String[] temp = arr[i].split(" ");
            String side0  = temp[0];
            if (i == n-1)
               temp[0] = "Begin";
            else{
                if(side1.equals("Left"))
                    temp[0] = "Right";
                else
                    temp[0] = "Left";
            }
            side1 = side0;



            new_arr[k] = String.join(" ",temp);
            k++;
        }

        return new_arr;
    }

    public static void main(String[] args) {
        String[] arr = {"Begin on Road D", "Right on Road C", "Left on Road B", "Left on Road A"};
        System.out.println(Arrays.toString(solve(arr)));

    }
}


