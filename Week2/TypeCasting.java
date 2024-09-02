import java.util.Scanner;
class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an int, double and char: ");
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        char charac = sc.next().charAt(0);
        byte b1 = (byte) num1;
        int cnum = (int) charac;
        byte b2 = (byte) num2;
        int dnum = (int) num2;
        System.out.printf("Int to byte: %d\nChar to int: %d\nDouble to byte: %d\nDouble to int: %d", b1, cnum, b2, dnum);
    }
}
