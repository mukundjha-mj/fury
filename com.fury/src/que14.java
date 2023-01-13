import java.util.*;

public class que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Value : ");
        int n = sc.nextInt();
        int n1 = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                int ch = 'A' + n1++;
                System.out.print((char)ch + " ");
                
            }
            n1 = 0;
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                int ch = 'A' + n1++;
                System.out.print((char)ch + " ");
                
            }
            n1 = 0;
            System.out.println();
        }
        
    }
}
