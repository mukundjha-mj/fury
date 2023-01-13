import java.util.*;

public class que37 {
    public static boolean search(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter What you want to search : ");
        int key = sc.nextInt();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == key) {
                    System.out.println(" Found at (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println(" Not Found");
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        System.out.print(" Enter Your Matrix : ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix);


    }
}
