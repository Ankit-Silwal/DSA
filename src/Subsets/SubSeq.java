package Subsets;
public class SubSeq{
  public static void main(String[] args) {
    subseq("","abcdef");
  }
  static void subseq(String p,String up){
    if(up.isEmpty()){
      System.out.printf("[%s] ,",p);
      return;
    }
    char ch=up.charAt(0); 
    subseq(p+ch,up.substring(1));
    subseq(p,up.substring(1));
  }
}