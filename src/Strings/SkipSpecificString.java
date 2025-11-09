package strings;

public class SkipSpecificString {
  public static void main(String[] args) {
    String str = "sdfajkhkfdfahappledfaappadfklhappdfhappappappal";
    System.out.println(skipapp(str, "app"));
  }

  static String skipapp(String str, String target) {
    if (str.length() == 0) {
      return "";
    }

    if (str.startsWith("apple")) {
      return "apple" + skipapp(str.substring(5), target);
    } else if (str.startsWith(target)) {
      return skipapp(str.substring(target.length()), target);
    } else {
      return str.charAt(0) + skipapp(str.substring(1), target);
    }
  }
}
