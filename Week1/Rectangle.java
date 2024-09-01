import java.util.Scanner;
class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt(), b = sc.nextInt();
        System.out.println("The \"circumference\" is "+(2*(l+b)));
        System.out.println("The area is "+(l*b));
    }
}