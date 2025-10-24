package BitManipulation;
import java.util.Scanner;
public class OddorEven {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  System.out.print("Enter the given number to check odd or even");
  int x=sc.nextInt();
  int y=1;
  if((x & y) ==1){
    System.out.print("Odd");
  }else{
    System.out.print("Even");
  }    
  }
  
}
