import java.util.*;

public class que23 {
    public static int largeNumber(int num[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 6, 3, 5};
        System.out.println("Our Largest Number is : " + largeNumber(num));

    }
}
