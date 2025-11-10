package oop.polymorphism;

public class Circle extends Shapes {
  //this will run when object of Circle is created
  //Hence it is overriding the parent method
  @Override //this is called annotation simply used for checkmark
  void area(){
    System.out.println("Area is pie*r*r");
  }
}
