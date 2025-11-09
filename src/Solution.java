import java.util.Arrays;

public class Solution {
  public static void main(String[] args) {
    boolean[][] arr={
      {true,true,true},
      {true,true,true},
      {true,true,true}
    };
    int [][] path=new int[arr.length][arr[0].length];
    path("",0,0,arr,path,1);
  }
  static void path(String p,int r,int c,boolean[][] arr,int[][] path,int step){
    if(r==arr.length-1 && c==arr[0].length-1){
      path[r][c]=step;
      for (int[] arrrows:path){
        System.out.println(Arrays.toString(arrrows));
      }
      System.out.println(p);
      System.out.println("\n \n");
      return;
    }
    if(!arr[r][c]){
      return;
    }
    arr[r][c]=false;
    path[r][c]=step;
    if(r<path.length-1){
      path(p+"D",r+1,c,arr,path,step+1);
    }
    if(c<path[0].length-1){
      path(p+"R",r,c+1,arr,path,step+1);
    }
    if(c>0){
      path(p+"L",r,c-1,arr,path,step+1);
    }
    if(r>0){
      path(p+"U",r-1,c,arr,path,step+1);
    }
    path[r][c]=0;  //Using the concept of heap and stack all the values are set to 0 and true respectively
    arr[r][c]=true;
  }
}