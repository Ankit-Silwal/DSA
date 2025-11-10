package oop.inheritance;

public class child extends parent{
  double weight;
  public child(){
    this.weight=-1;
  }
  public child(double l,double h,double w,double weight){
    super(l,h,w); //it is saying to call the parent class consturctor
    //used to initialize the value in parent class
    this.weight=weight;
  }
}
