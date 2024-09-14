import java.util.Scanner;
public class Counter {
    static int count;
    Counter() {
        count++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to create a new object, 2 to exit: ");
        while(true) {
            int ch = sc.nextInt();
            if (ch == 2)
                break;
            if (ch != 1) {
                System.out.print("Invalid choice\nEnter choice: ");
                continue;
            }
            Counter obj = new Counter();
            System.out.print("Enter choice: ");
        }
        System.out.println(count+" objects created");
    }
}
