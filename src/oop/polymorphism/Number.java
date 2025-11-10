package oop.polymorphism;

public class Number {
  int sum(int a,int b){
    return a+b;
  }
  int sum(int a,int b,int c){
    return a+b+c;
  }
  int sum(int a,int b,int c,int d){
    return a+b+c+d;
  }
  public static void main(String[] args) {
      Number obj=new Number();
      obj.sum(2,3);
      obj.sum(4,5,6,7);
  }
}
