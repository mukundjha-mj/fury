import java.util.*;

public class que34 {
    public static boolean checkTwice(int num[]) {
        for(int i = 0; i < num.length -1; i++){
            for(int j = i + 1; j < num.length; j++){
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of you array : ");
        int n = sc.nextInt();
        System.out.print("Enter Your Array with space : ");

        int[] num = new int[n];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(checkTwice(num));

    }
}
