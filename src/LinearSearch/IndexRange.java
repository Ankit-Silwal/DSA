package linearsearch;

public class IndexRange{
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8};
    int target=3;
    int lowerindex=1;
    int upperindex=4;
    System.out.println(searchArray(arr, target, lowerindex, upperindex));
  }
  static int searchArray(int[] arr,int target,int lowerindex,int upperindex){
    for(int i=lowerindex;i<upperindex+1;i++){
      if(arr[i]==target){
        return i;
      }
    }
    return -1;
  }

}