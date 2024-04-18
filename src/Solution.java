import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int maxWidthOfVerticalArea(int[][] points) {

        int[] arr = new int[points.length];
        for(int i = 0; i<arr.length; i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int minim = 0;
        for(int i = 0; i<arr.length-1;i++){
            if (arr[i+1]-arr[i]>minim)
                minim = arr[i+1]-arr[i];
        }
        return minim;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {3, 1},
                {9, 0},
                {1, 0},
                {1, 4},
                {5, 3},
                {8, 8}
        };
        System.out.println(maxWidthOfVerticalArea(matrix));
    }
}