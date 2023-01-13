import java.util.*;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length : ");
        int l = sc.nextInt();
        System.out.print("Enter Breath : ");
        int b = sc.nextInt();

        if (l - b == 0) {
            System.out.println("It is Square.");
        }
        else
            System.out.println("It is not Square.");
    }
    
}