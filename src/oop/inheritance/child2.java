package oop.inheritance;

public class child2 extends child{
  double cost;
  child2(){
    super();
    this.cost=-2;
  }
  child2(child2 other){
    super(other);
    this.cost=other.cost;
  }
  public child2(double l,double h,double w,double weight,double cost){
    super(l,h,w,weight);
    this.cost=cost;
  }
  public child2(double side,double weight,double cost){
    super(side,weight);
    this.cost=cost;
  }
}
