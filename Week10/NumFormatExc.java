import java.util.Scanner;

class NumFormatExc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str;
        str = scan.next();
        int num;
        try {
            num = Integer.parseInt(str);
        }
        catch (NumberFormatException n) {
            System.out.println("Error: could not convert to number");
        }
        finally {
            System.out.print(str);
        }
    }
}
