import java.util.*;

public class que16 {

    public static boolean isPrime() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static int binoCoeffi() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number For Binomial Coefficient : ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int ncr = fact_n / (fact_r * fact_nmr);
        return ncr;
    }

    public static boolean isPrimeOpti() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(isPrime());
        System.out.println(isPrimeOpti());
        // System.out.print("Enter Your Number : ");
        // System.out.println(factorial(sc.nextInt()));
        // System.out.println(binoCoeffi());

    }
}
