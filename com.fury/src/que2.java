import java.net.SocketTimeoutException;
import java.util.*;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();

        if (n < 0 ) {
            n = n * -1;
        }
        System.out.println("The absolute Number is " + n); 

    }    
}
