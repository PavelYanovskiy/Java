package Lesson5;

public class test {
    private static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] board = new int[SIZE][SIZE];

        if (solve(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Решение не найдено");
        }
    }

    private static boolean solve(int[][] board, int col) {
        if (col >= SIZE) {
            return true;
        }

        for (int i = 0; i < SIZE; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solve(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
            }
        }

        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < SIZE && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
