import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {

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

class Circle extends Shape {

    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {

    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {

    double length;

    Square(double l) {
        length = l;
    }

    @Override
    double area() {
        return length * length;
    }
}

class Area1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of rectangle: ");
        double l = sc.nextDouble(), br = sc.nextDouble(), r;
        System.out.print("Enter radius of circle: ");
        r = sc.nextDouble();
        Rectangle rec = new Rectangle(l, br);
        Circle cir = new Circle(r);
        System.out.print("Enter dimensions of triangle: ");
        double ba = sc.nextDouble(), h = sc.nextDouble(), side;
        System.out.print("Enter length of square: ");
        side = sc.nextDouble();
        Triangle tri = new Triangle(ba, h);
        Square sq = new Square(size);
        System.out.println("Area of rectangle = "+rec.area()+"\nArea of circle = "+cir.area()+
                           "Area of triangle = "+tri.area()+"\nArea of square = "+sq.area());
    }
}
