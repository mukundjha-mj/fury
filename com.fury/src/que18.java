import java.util.*;

public class que18 {
    public static void palindrom() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your Number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        while(temp != 0){

            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println(" " + n + " Is a Palindrom Number");
        }else
            System.out.println(" " + n + " Is not a Palindrom number");

    }
    public static void main(String[] args) {
        palindrom();
    }
}
