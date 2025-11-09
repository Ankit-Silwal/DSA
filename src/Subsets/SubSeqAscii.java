package subsets;

import java.util.ArrayList;
public class SubSeqAscii {
  public static void main(String[] args) {
      String value="dfh";
      System.out.println(subsetascii("",value));
  }
  static ArrayList<String> subsetascii(String p,String up){
    if(up.length()==0){
      ArrayList <String> ans=new ArrayList<>();
      ans.add(p);
      return ans;
    }
    char ch=up.charAt(0);
    ArrayList<String> left=subsetascii(p,up.substring(1));
    ArrayList<String> middle=subsetascii(p+ch,up.substring(1));
    ArrayList<String> right=subsetascii(p+(int)ch,up.substring(1));
    left.addAll(middle);
    left.addAll(right);
    return left;
  }
}
