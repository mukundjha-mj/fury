import java.util.*;

public class que24 {
    public static int binarySearch(int num[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number for search : ");
        int n = sc.nextInt();

        int start = 0, end = num.length- 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == n) {
                return mid;
            } 
            if (num[mid] < n) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        System.out.println("Index of num is : " + binarySearch(num));        

    }
}
