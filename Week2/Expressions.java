import java.util.Scanner;
class Expressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((a << 2) + (b >> 2));
        System.out.println(b > 0);
        System.out.println((a + b * 100) / 10);
        System.out.println(a & b);
    }
}