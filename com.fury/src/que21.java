import java.util.*;

public class que21 {
    public static int sumOfDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your Number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(" Sum of number is : " + sumOfDigits());
    }
}
