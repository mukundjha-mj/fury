import java.util.*;

public class que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        
        

        for(int i = 1; i <= n; i++){
            int rem, sum = 0;
            int c = i;
            while (c != 0) {
                rem = c % 10;
                sum  = sum + (rem * rem * rem);
                c = c / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        
    }
}
