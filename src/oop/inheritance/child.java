package oop.inheritance;

public class child extends parent{
  double weight;
  public child(){
    this.weight=-1;
  }
  public child(double l,double h,double w,double weight){
    super(l,h,w); //it is saying to call the parent class consturctor
    //used to initialize the value in parent class
    //Super class has no idea what this calss contain 
    //Child class really care about what the parent calss contains 
    //thus parent doesnt care much on the childrern whille the chilren needs to care about the parent opposible to real life lol
    this.weight=weight;
  }
  child(double side,double weight){
    super(side);
    this.weight=weight;
  }
  child(child other){
    super(other.l, other.h, other.w);
    this.weight=other.weight;
  }
}
