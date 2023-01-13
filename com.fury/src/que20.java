import java.util.*;

public class que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your First Number  : ");
        int x = sc.nextInt();
        System.out.print(" Enter Your Second Number : ");
        int y = sc.nextInt();

        System.out.println("Maximam of two number is " + Math.max(x, y));
        System.out.println("Minimum of two number is " + Math.min(x, y));
        System.out.println("Squre root of " + x + "is " + Math.sqrt(x));
        System.out.println("power of " + x + "and " + y + "is " + Math.pow(x, y));        
    }
}
