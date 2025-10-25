package Maths;

public class Prime {
  public static void main(String[] args) {
      int x=7;
      System.out.println(isPrime(x));
  }
  static boolean isPrime(int n){
    if(n==1){
      return false;
    }
    int c=2;
    while(c*c<=n){
      if(n%c==0){
        return false;
      }
      c++;
    }
    return true;
  }
}
