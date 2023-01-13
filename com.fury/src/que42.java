public class que42 {
    public static int search(int matrix[][], int key) {
        int countOfKey = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    countOfKey++;
                }
            }
        }
        return countOfKey;
    }

    public static int sumOf2DArray(int nums[][]) {
        int sumOf2ndRow = 0;
        // 1st method
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[0].length; j++) {
        // if (i == 1) {
        // sumOf2ndRow += nums[i][j];
        // }
        // }
        // }
        // 2nd method
        for (int j = 0; j < nums[0].length; j++) {
            sumOf2ndRow += nums[1][j];
        }
        return sumOf2ndRow;
    }

    public static void transposeArray(int[][] array) {
        int row = 2, col = 3;
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] array) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // for search key how many times he comes in array
        int matrix[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        int key = 8;
        // for count sum of 2nd row of 2D array
        int nums[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };
        // for transpose 
        int[][] array= { {2,3,7}, {5,6,7} };

        transposeArray(array);
    }
}
