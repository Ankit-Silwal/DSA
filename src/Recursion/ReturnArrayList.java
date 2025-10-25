package Recursion;

import java.util.ArrayList;

public class ReturnArrayList {
  public static void main(String[] args) {
    int[] arr={1,2,3,6,7,4,4};
    System.out.print(search(arr,4,0));    
  }
  static ArrayList<Integer> search(int[] arr,int target,int index){
    ArrayList<Integer> list=new ArrayList<>();
    if(index==arr.length){
      return list;
    }
    if(arr[index]==target){
      list.add(index);
    }
    ArrayList<Integer> ansFromBelowCalls= search(arr,target,index+1);
    list.addAll(ansFromBelowCalls);
    return list;
  }
  
}
