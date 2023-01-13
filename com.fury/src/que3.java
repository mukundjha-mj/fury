import java.util.*;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price : ");        
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp = sc.nextInt();
        int amt;

        if (cp > sp) {
            amt = cp - sp;
            System.out.println("The loss is " + amt);    
        } 
        else if(sp > cp){
            amt = sp - cp;
            System.out.println("The Profit is " + amt);
        }

    }    
}
