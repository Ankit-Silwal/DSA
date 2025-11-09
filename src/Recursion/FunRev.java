package recursion;

public class FunRev {
  public static void main(String[] Args){
    int n=5;
    funRev(n);
  }
  static void funRev(int n){
    if(n==0){
      return;
    }
    funRev(n-1);
    System.out.print(n+" ");
  }
}
