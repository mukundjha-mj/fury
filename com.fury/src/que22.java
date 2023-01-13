import java.util.*;

public class que22 {
    public static int cantine(String food[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to feed ?");
        String ans = sc.nextLine();
        for(int i = 0; i < food.length; i++){
            if (food[i] == ans) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        String food[] = {"pani puri", "litti chokha", "samosa", "pizza", "briyani"};
        int index = cantine(food);
        if (index == -1) {
            System.out.println("This is not in our menu");
        } else {
            System.out.println("Yes this is available");
        }
    }
}
