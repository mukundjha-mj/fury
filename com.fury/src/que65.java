public class que65 {
    public static boolean isSafe(int sudoku[][], int row, int col, int digits) {
        for(int i = 0; i <= 8; i++){
            if (sudoku[i][col] == digits) {
                return false;
            }
        }
        for(int j = 0; j <= 8; j++){
            if (sudoku[row][j] == digits) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if (sudoku[i][j] == digits) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digits = 1; digits <= 9; digits++){
            if (isSafe(sudoku, row, col, digits)) {
                sudoku[row][col] = digits;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;                    
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    private static void printSudoku(int[][] sudoku) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0, 0, 0, 0, 0, 0, 5, 0, 0},
                          {3, 0, 2, 0, 7, 0, 9, 1, 0},
                          {6, 0, 0, 9, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 2, 6},
                          {0, 2, 0, 3, 0, 0, 1, 5, 9},
                          {7, 9, 0, 6, 0, 5, 0, 8, 0},
                          {1, 0, 9, 7, 0, 0, 0, 0, 0},
                          {4, 5, 0, 0, 0, 0, 2, 3, 0},
                          {0, 3, 8, 4, 5, 0, 6, 0, 0}};
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution Not Exists");
        }
    }
}
