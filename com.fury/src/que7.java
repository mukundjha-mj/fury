import java.util.*;

public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            count++;
            n /=10;    
        }
        System.out.println("Number of digit is " + count + ".");

    }
}
