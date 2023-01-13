import java.util.*;

public class que17 {
    public static int average() {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.print(" Enter Your First Number  : ");
        x = sc.nextInt();
        System.out.print(" Enter Your Second Number : ");
        y = sc.nextInt();
        System.out.print(" Enter Your Third Number  : ");
        z = sc.nextInt();
        System.out.print("\033[H\033[2J");

        return (x + y + z) / 3;

    }
    public static void main(String[] args) {
        System.out.println(" Average of Three Number : " + average() + "\n");
    }
}

