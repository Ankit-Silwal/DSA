package oop.staticexample;
public class StaticBlock{
  static int a=4;
  static int b;
  //will only be created once when the first object is created or when the calss is loaded for the first time 
  static {
    System.out.println("I am in the staic block");
    b=a*5;
  }
  public static void main(String[] args) {
      StaticBlock obj=new StaticBlock();
      System.out.println(StaticBlock.a+" "+StaticBlock.b);
      StaticBlock.b+=4;
      StaticBlock obj2=new StaticBlock();
      System.out.println(StaticBlock.b);
      StaticBlock.b+=5;
      StaticBlock obj3=new StaticBlock();
      System.out.println(StaticBlock.b);
  }
}