import java.util.ArrayList;
public class Solution {
  public static void main(String[] args) {
    isUgly(20);
  }
  static void isUgly(int n) {
      ArrayList <Integer> list=new ArrayList<>();
      for(int i=1;i*i<=n;i++){
        if(n%i==0){
          if(n/i==i){
            list.add(n/i);
          }
          else{
            list.add(i);
            list.add(n/i);
          }
        }
      }
      for(int i=0;i<=list.size())
  }
}