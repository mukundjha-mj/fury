import java.util.*;

public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks : ");
        int marks = sc.nextInt();

        if (marks >= 100 || 90 <= marks ) {
            System.out.println("Your Grade is 'A+'.");
        } 
        else if(marks >= 90 || 80 <= marks ){
            System.out.println("Your Grade is 'A'.");
        }
        else if(marks >= 80 || 70 <= marks ){
            System.out.println("Your Grade is 'B+'.");
        }
       else if(marks >= 70 || 60 <= marks ){
            System.out.println("Your Grade is 'B'.");
        }
        else if(marks >= 60 || 50 <= marks ){
            System.out.println("Your Grade is 'C'.");
        }
        else if(marks >= 50 || 40 <= marks ){
            System.out.println("Your Grade is 'D'.");
        }
        else if(marks >= 40 || 30 <= marks ){
            System.out.println("Your Grade is 'E'.");
        }
        else if(marks >= 30 || 0 <= marks ){
            System.out.println("Your Grade is 'F'.");
        }
        else if(marks < 100)
            System.out.println("Enter valid marks.");


    }
}
