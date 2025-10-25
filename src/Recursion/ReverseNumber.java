package Recursion;

public class ReverseNumber {
  public static void main(String[] args) {
    int n = 1234;
    System.out.println(reverse(n));
  }

  static int reverse(int n) {
    int digits = (int)(Math.log10(n)) + 1;
    return helper(n, digits);
  }

  static int helper(int n, int digits) {
    if (n % 10 == n) {
      return n;
    }
    int rem = n % 10;
    return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
  }
}
