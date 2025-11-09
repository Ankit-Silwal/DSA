package mazeproblems;

import java.util.ArrayList;
public class RDPaths {
    public static void main(String[] args) {
        System.out.println(paths("",3,3,1,1));
    }  
    static ArrayList<String> paths(String p,int rows,int cols,int srows,int scols){
      if(rows==srows && cols==scols){
        ArrayList<String> res=new ArrayList<>();
        res.add(p);
        return res;
      }
      ArrayList <String> list=new ArrayList<>();
      if(srows<=rows){
        list.addAll(paths(p+"D",rows,cols,srows+1,scols));
      }
      if(scols<=cols){
        list.addAll(paths(p+"R",rows,cols,srows,scols+1));
      }
      return list;
    }
}
 