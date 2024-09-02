import java.util.Scanner;

class Leap {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Common year");
    }
}