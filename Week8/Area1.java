import java.util.Scanner;

abstract class hasArea {
    abstract double area();
}

class Rectangle extends hasArea {

    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

class Circle extends hasArea {

    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Area1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of rectangle: ");
        double l = sc.nextDouble(), b = sc.nextDouble(), r;
        System.out.print("Enter radius of circle: ");
        r = sc.nextDouble();
        Rectangle rec = new Rectangle(l, b);
        Circle cir = new Circle(r);
        System.out.println("Area of rectangle = "+rec.area()+"\nArea of circle = "+cir.area());
    }
}
