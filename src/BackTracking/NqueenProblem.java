package backtracking;

import java.util.Scanner;
//Given n*n board place n queen on it display how many ways you can do it ?
public class NqueenProblem {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of queen you want to have on the board");
      int n = sc.nextInt();
      
      boolean[][] matrix = new boolean[n][n]; // default all false, no need to fill true manually

      // use the boolean board used by the solver
      boolean[][] board = matrix;
      int ways = queens(board, 0);
      System.out.println("Number of ways: " + ways);
      sc.close();
  }

  static int queens(boolean[][] board, int row) {
    if (row == board.length) {
      display(board);
      System.out.println(); // spacing between boards
      return 1;
    }

    int count = 0;
    for (int col = 0; col < board.length; col++) {
      // place the queen if the place is safe
      if (isSafe(board, row, col)) {
        board[row][col] = true;
        count += queens(board, row + 1);
        board[row][col] = false;
      }
    }
    return count;
  }

  private static boolean isSafe(boolean[][] board, int row, int col) {
    // check the vertical column
    for (int i = 0; i < row; i++) {
      if (board[i][col]) {
        return false;
      }
    }

    // check the upper-left diagonal
    int maxLeft = Math.min(row, col);
    for (int i = 1; i <= maxLeft; i++) {
      if (board[row - i][col - i]) {
        return false;
      }
    }

    // check the upper-right diagonal
    int maxRight = Math.min(row, board.length - col - 1);
    for (int i = 1; i <= maxRight; i++) {
      if (board[row - i][col + i]) {
        return false;
      }
    }

    return true;
  }

  private static void display(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean element : row) {
        if (element) {
          System.out.print("Q ");
        } else {
          System.out.print("X ");
        }
      }
      System.out.println();
    }
  }
}
