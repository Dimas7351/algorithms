import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class LeetCode27 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i<nums.length;i++){
            if (nums[i]!=val){
                k++;
                nums[k] = nums[i];
        }}
        return k;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
}
