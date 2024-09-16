import java.util.Scanner;

interface hasArea {
    double area();
}

class Triangle implements hasArea {

    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Square implements hasArea {

    double length;

    Square(double l) {
        length = l;
    }

    @Override
    public double area() {
        return length * length;
    }
}

class Area4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of triangle: ");
        double b = sc.nextDouble(), h = sc.nextDouble(), l;
        System.out.print("Enter length of square: ");
        l = sc.nextDouble();
        Triangle tri = new Triangle(b, h);
        Square sq = new Square(l);
        System.out.println("Area of triangle = "+tri.area()+"\nArea of square = "+sq.area());
    }
}