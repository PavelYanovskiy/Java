package Lesson5;
//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
public class HomeTask4 {
    private static final int BOARD_SIZE = 8;
    private static int[] queens = new int[BOARD_SIZE];

    public static void main(String[] args) {
        placeQueens(0);
    }
//пытается разместить ферзя на каждой строке доски. 
    private static void placeQueens(int row) {
        if (row == BOARD_SIZE) {
            printQueens();
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isValidPosition(row, col)) {
                queens[row] = col;
                placeQueens(row + 1);
            }
        }
    }
//проверяет, не находится ли ферзь в угрозе других ферзей. 
    private static boolean isValidPosition(int row, int col) {
        for (int i = 0; i < row; i++) {
            int otherCol = queens[i];
            if (col == otherCol) {
                return false;
            }
            int colDiff = Math.abs(col - otherCol);
            int rowDiff = row - i;
            if (colDiff == rowDiff) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
