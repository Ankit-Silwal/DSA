package backtracking;

//Here i will try to implement the logic for the diagonal too represnted by small "d" will code completly for the 
//purpose of practice
package BackTracking;

import java.util.Arrays;

public class PathMatrixDiawithObs {
  public static void main(String[] args) {
    boolean[][] matrix={
      {true,true,false},
      {true,true,true},
      {false,true,true}
    };
    int[][] paths=new int[matrix.length][matrix[0].length];
    paths("",0,0,matrix,paths,1);
  }
  static void paths(String p,int r,int c,boolean[][] matrix,int[][] paths,int step){
    if(r==paths.length-1 && c==paths[0].length-1){
      paths[r][c]=step;
      for(int[] path:paths){
        System.out.println(Arrays.toString(path));
      }
      System.out.printf("\n %S \n \n",p);
      return;
    }
    if(!matrix[r][c]){
      return;
    }
    matrix[r][c]=false;
    paths[r][c]=step;
    if(r<paths.length-1){
      paths(p+"D",r+1,c,matrix,paths,step+1);
    }
    if(c<paths[0].length-1){
      paths(p+"R",r,c+1,matrix,paths,step+1);
    }
    if(r<paths.length-1 && c<paths[0].length-1){
      paths(p+"d",r+1,c+1,matrix,paths,step+1);
    }
    if(r>0){
      paths(p+"U",r-1,c,matrix,paths,step+1);
    }
    if(c>0){
      paths(p+"L",r,c-1,matrix,paths,step+1);
    }
    matrix[r][c]=true;
    paths[r][c]=0;
  }
}

