import java.util.*;

public class que38 {
    public static void largeAndSmall(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
                
            }
        }
        System.out.println(" " + largest + " is large.");
        System.out.println(" " + smallest + " is small.");
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
        largeAndSmall(matrix);
    }
}
