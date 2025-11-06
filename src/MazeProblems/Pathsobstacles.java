package MazeProblems;

import java.util.ArrayList;

public class Pathsobstacles {
  public static void main(String[] args) {
    System.out.println(paths("",3,3,1,1));    
  }
  static ArrayList<String> paths(String p,int r,int c,int obsr,int obsc){
    if(r==1 && c==1){
      ArrayList <String> list=new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> ans=new ArrayList<>();
    if(r>1 && r!=obsr-1){
      ans.addAll(paths(p+"D",r-1,c,obsr,obsc));
    }
    if(c>1 && c!=obsc-1){
      ans.addAll(paths(p+"R",r,c-1,obsr,obsc));
    }
    return ans;
  }
}
