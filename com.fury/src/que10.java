import java.util.*;

public class que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your number : ");
        int n = sc.nextInt();

        int n1 = 0, n2 = 1, n3 ;

        for(int i = 1; i <= n; i++){
                System.out.print(n1 + " ");
                n3 = n2 + n1; 
                n1 = n2;
                n2 = n3;

        }
        System.out.println();

        
    }
}
