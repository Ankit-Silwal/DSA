package backtracking;

//Given n*n board place n queen on it dsiplay how many ways you can do it ?
public class NqueenProblem {
  public static void main(String[] args) {
      
  }  
  static int queens(boolean[][] board,int row){
    if(row==board.length){
      display(board);
    }
    return 1;
  }
  private static void dispaly(boolean[][] board){
    for(boolean[] row:board){
      for(boolean element:row){
        if(element){
          System.out.print("Q");
        }
        else{
          System.out.print("X");
        }
      }
    }
    System.out.println();
  }
}

