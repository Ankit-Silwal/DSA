package Permutaions;

public class countpermutaion {
  public static void main(String[] args) {
      System.out.print(count("abc"));
  }
  static int count(String up){
    int count=1;
    int length=up.length()+1;
    for(int i=1;i<length;i++){
      count*=i;
    }
    return count;
  }
    
}
