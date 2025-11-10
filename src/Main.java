class Outer {
    static class Inner {
        void display() {
            System.out.println("Static inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner(); // No need of Outer object
        obj.display();
    }
}
