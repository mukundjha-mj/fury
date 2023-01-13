import java.util.*;

public class que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number for reverse : ");
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            
            n /= 10;

        }
        System.out.println("Reverse of the number is " + rev + ".");

    }
}
