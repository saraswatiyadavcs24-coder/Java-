import java.util.Scanner;

class InputScanner {
    Scanner sc = new Scanner(System.in);
}

abstract class Shape extends InputScanner {
    int x, y;
    abstract void printArea();
}

class Rectangle extends Shape {
    void input() {
        System.out.println("Enter the dimensions of the rectangle (length and breadth):");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    void printArea() {
        System.out.println("Area of Rectangle = " + (x * y));
    }
}

class Triangle extends Shape {
    void input() {
        System.out.println("Enter the dimensions of the triangle (base and height):");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * x * y));
    }
}

class Circle extends Shape {
    void input() {
        System.out.println("Enter the dimension of the circle (radius):");
        x = sc.nextInt();
    }
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * x * x));
    }
}


public class AreaDemo {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.input();
        r.printArea();

        Triangle t = new Triangle();
        t.input();
        t.printArea();

        Circle c = new Circle();
        c.input();
        c.printArea();
    }
}
