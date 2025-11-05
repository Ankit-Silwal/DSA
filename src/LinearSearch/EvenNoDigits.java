package LinearSearch;
public class EvenNoDigits {
  public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6};
      System.out.print(findNumbers(arr));
  }
  static int findNumbers(int[] nums){
    int count=0;
    for(int i=0;i<nums.length;i++){
      int result=(int)Math.log10(nums[i]);
      if(result%2!=0){
        count++;
      }
    }
    return count;
  }      
}
