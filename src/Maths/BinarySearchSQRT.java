package maths;

public class BinarySearchSQRT {
  public static void main(String[] args) {
      int n = 40;
      int p = 3;
      System.out.println(sqrt(n, p));
  }

  static double sqrt(int n, int p) { 
    int s = 0;
    int e = n;
    double ans = 0;

    while (s <= e) {
      int m = s + (e - s) / 2;
      if (m * m == n) {
        return m;
      } else if (m * m < n) {
        ans = m;
        s = m + 1;
      } else {
        e = m - 1;
      }
    }

    double temp = 0.1;
    for (int i = 1; i <= p; i++) {
      while (ans * ans <= n) {
        ans += temp;
      }
      ans -= temp;
      temp = temp / 10;
    }

    return ans;
  }
}
