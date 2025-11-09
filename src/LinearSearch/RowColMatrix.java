package linearsearch;

import java.util.Arrays;
public class RowColMatrix {
  public static void main(String[] args) {
      int [][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9},
      };
      int target=8;
      System.out.print(Arrays.toString(search(arr,target)));
  }
  static int[] search(int[][] matrix,int target){
    int r=0,c=matrix.length-1;
    while(r<matrix.length && c>=0){
     if(matrix[r][c]==target){
      return new int[] {r,c};
     } 
     if(matrix[r][c]<target){
      r++;
     }else{
      c--;
     }
    }
    return new int[] {-1,-1};
  }
}
