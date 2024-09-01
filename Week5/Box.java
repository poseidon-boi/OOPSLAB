import java.util.Scanner;
class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions of box: ");
        double w = sc.nextDouble(), h = sc.nextDouble(), d = sc.nextDouble();
        Box b = new Box(w, h, d);
        System.out.println("The volume is "+ b.volume());
    }
}