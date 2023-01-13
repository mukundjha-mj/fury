import java.util.*;

public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter Opreter : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter 2nd Number : ");
        double b = sc.nextDouble();
        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Sum of 1st and 2nd number is " + result + ".");        
                break;
            case '-':
                result = a - b;
                System.out.println("sub of 1st and 2nd number is " + result + ".");        
                break;
            case '*':
                result = a * b;
                System.out.println("Multiplication of 1st and 2nd number is " + result + ".");        
                break;
            case '/':
                result = a / b;
                System.out.println("Divison of 1st and 2nd number is " + result + ".");        
                break;
            case '%':
                result = a % b;
                System.out.println("Reminder of 1st and 2nd number is " + result + ".");        
                break;
            
        
            default:
                System.out.println("Enter a valid opreter");
                break;
        }

    }
}
