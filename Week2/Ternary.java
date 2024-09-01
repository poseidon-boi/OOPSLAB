import java.util.Scanner;
class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), l, s;
        l = (a>b)?((a>c)?a:c):((b>c)?b:c);
        s = (a<b)?((a<c)?a:c):((b<c)?b:c);
        System.out.println("Largest = "+ l +"\nSmallest = "+ s);
    }
}