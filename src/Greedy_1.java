import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Greedy_1 {

    public static void main(String[] args) {
        int[] digits = {1,3,7,9,9,5};
        System.out.println(maxNumberFromDigits(digits));
        System.out.println(lambda(digits));
    }

    public static String maxNumberFromDigits(int[] digits){
       // int[] temp = new int[digits.length];
       // Сложность сортировки = O(n*log(n))

       Arrays.sort(digits);

       String result = "";

       for(int i = digits.length-1; i>=0; i--){
           result += digits[i];
       }
       return result;
    }

    public static String lambda(int[] digits){
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }
}
