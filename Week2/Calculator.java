import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        char op, exit = 'y';
        do {
            System.out.print("Enter expression: ");
            x = sc.nextInt();
            op = sc.next().charAt(0);
            y = sc.nextInt();
            switch(op) {
                case '+':
                    System.out.println(x+y);
                    break;
                case '-':
                    System.out.println(x-y);
                    break;
                case '*':
                    System.out.println(x*y);
                    break;
                case '/':
                    System.out.println(x/y);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.print("Do another (y/n)? ");
            exit = sc.next().charAt(0);
        } while(exit != 'n' && exit != 'N');
    }
}
