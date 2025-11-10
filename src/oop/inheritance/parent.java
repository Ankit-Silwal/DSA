package oop.inheritance;

public class parent {
  double l;
  double h;
  double w;

  parent(){
    this.h=1;
    this.l=1;
    this.w=1;
  }
  parent(double side){
    this.w=side;
    this.l=side;
    this.h=side;
  }
  parent(double l,double h,double w){
    this.l=l;
    this.h=h;
    this.w=w;
  }
  parent(parent old){
    this.h=old.h;
    this.w=old.w;
    this.l=old.l;
  }
  public void information(){
    System.out.println("Running the box");

  }
  
}
