package bitmanipulation;

import java.util.Scanner;
public class MagicNumber {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the required number :");
    int x=sc.nextInt();
    System.out.println(magicnumber(x));
  }
  static int magicnumber(int num){
    int i=1,ans=0;
    while(num !=0){
      if(((num&1))==1){
        ans+=Math.pow(5,i);
      }
      i++;
      num=(num>>1);
    }
    return ans;
  }
  
}
