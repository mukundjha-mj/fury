import java.util.*;

public class que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number is negative and skipped.");
        } else {
            System.out.println("The Number is Positive " + n + ".");
        }
    }    
}
