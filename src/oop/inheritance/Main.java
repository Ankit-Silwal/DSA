package oop.inheritance;

public class Main {
  public static void main(String[] args) {
    // parent parent=new parent(4);
    // System.out.println(parent.l+" "+parent.w+" "+parent.h);
    child child=new child();
    System.out.println(child.l+" "+child.weight);
    child2 mini=new child2(5,8,5);
    System.out.println(mini.cost);
  }
}
