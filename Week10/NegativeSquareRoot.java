import java.util.Scanner;

class NegativeSquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scan.nextDouble();
        double sqrtnum = Math.sqrt(num);
        if (Double.isNaN(sqrtnum)) {
            sqrtnum = Math.sqrt(-num);
            System.out.print("The square root is: "+sqrtnum+"i");
            return;
        }
        System.out.print("The square root is: "+sqrtnum);
    }
}
