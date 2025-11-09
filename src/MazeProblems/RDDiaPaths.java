package mazeproblems;

import java.util.ArrayList;

public class RDDiaPaths {
  public static void main(String[] args) {
      System.out.println(pathDia("", 3, 3));
  }
  static ArrayList<String> pathDia(String p,int r,int c){
    if(r==1 && c ==1){
      ArrayList<String> ans=new ArrayList<>();
      ans.add(p);
      return ans; 
    }
    ArrayList<String> list=new ArrayList<>();
    if(r>1){
      list.addAll(pathDia(p+"D", r-1, c));
    }
    if(c>1){
      list.addAll(pathDia(p+"R", r, c-1));
    }
    if(c>1&&r>1){
      list.addAll(pathDia(p+"d", r-1, c-1));
    }
    return list;
  }
}
