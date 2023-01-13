import java.util.*;

public class que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == n / 2) {
                    System.out.print("*");
                } else {
                    if (j == n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    
                }
            }
            System.out.println();
        }
        
    }
}
