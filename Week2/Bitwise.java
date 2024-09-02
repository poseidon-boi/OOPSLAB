import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number divided by 2 is: "+(num >> 1));
        System.out.println("Number multiplied by 2 is: "+(num << 1));
    }
}
