import java.util.*;

public class que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your number : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = n; i > 0 ; i--){
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("The sum of all digits is " + sum + ".");

    }
}
