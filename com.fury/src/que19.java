import java.util.*;

public class que19 {
    public static boolean isEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        if (isEven()) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd");
        }
    }

}
