//This methond isnt that good for small numbers but gives fine for the larger number
package Maths;

public class NewtonSqrRoot {
  public static void main(String[] args) {
    System.out.println(sqrt(90000));
  }
  static double sqrt(double n){
    double x=n;
    double root=0;
    while (true) { 
        root= 0.5* (x +n/x);
        if(Math.abs(root-x)<1){
          break;
        }
        x=root;
    }
    return root;
  }
}
