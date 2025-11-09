package oop.staticexample;
import oop.packages.staticexample.Human;
public class Main {
  public static void main(String[] args) {
    Human kunal=new Human(22,"Kunal",10000,false);
    Human Ankit=new Human(21,"Ankit",15000,true);
    System.out.println(Ankit.name);
    System.out.println(kunal.population);
    greeting();
  }
  static void greeting(){
    System.out.print("Hello world");
  }
}
