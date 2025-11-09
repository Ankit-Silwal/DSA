import java.util.Scanner;
public class Solution {
  public static void main(String[] args) {
    System.out.println("Enter the number of queen / n*n of board and n<=9");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean[][] matrix=new boolean[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        matrix[i][j]=true;
      }
    }
    int[][] places=new int[n][n];
    Nqueen(0,0,matrix,places,0);
  }
  static void Nqueen(int r,int c,boolean[][] matrix,int[][] places,int placed){
    if(placed==matrix.length){
      return;
    }
    if(!matrix[r][c]){
      return;
    }
    places[r][c]=1;
    if(r<matrix.length-1){
      for(int i=0;i<matrix.length-1;i++){
        matrix[r][i]=false;
        matrix[i][c]=false;
      }
      Nqueen(r+1, c, matrix, places, placed+1);
    }
    if(c<matrix[0].length-1){
      for(int i=0;i<matrix.length-1;i++){
        matrix[r][i]=false;
        matrix[i][c]=false;
      }
      Nqueen(r, c+1, matrix, places, placed+1);
    }
    if(r>0){
      Nqueen(r-1, c, matrix, places, placed+1);
    }
    if(c>0){
      Nqueen(r, c-1, matrix, places, placed+1);
    }
    if(r<matrix[0].length-1 && c<matrix[0].length-1){
      int tr=r,tc=c;
      while(tr<matrix.length && tc < matrix.length){
        matrix[tr++][tc--]=false;
      }
      
      tr=r;
      tc=c;
      while(tr<matrix.length && tc<matrix.length){
        matrix[tr--][tc++]=false;
      }
    }

  }
}
