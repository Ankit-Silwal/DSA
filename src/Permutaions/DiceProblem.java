package Permutaions;
import java.util.ArrayList;

public class DiceProblem {
  public static void main(String[] args) {
      System.out.println(dice("", 4));
  }

  static ArrayList<String> dice(String p, int target) {
    if (target == 0) {
      ArrayList<String> ans = new ArrayList<>();
      ans.add(p);
      return ans;
    }

    ArrayList<String> list = new ArrayList<>();
    for (int i = 1; i <= 6 && i <= target; i++) {
      list.addAll(dice(p + i, target - i));
    }
    return list;
  }
}
