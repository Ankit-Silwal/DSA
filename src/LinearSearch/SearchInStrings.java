package linearsearch;

public class SearchInStrings {
  public static void main(String[] args) {
      String name="Ankit";
      char target='i';
      System.out.println(search(name, target));
  }
  static boolean search(String str,char target){
    for(int i=0;i<str.length();i++){
      char element=str.charAt(i);
      if(element==target){
        return true;
      }
    }
    return false;
  }
}
