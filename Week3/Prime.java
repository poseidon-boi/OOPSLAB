import java.util.Scanner;
import java.lang.Math;
class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m and n: ");
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = m; i < n; i++) {
            boolean prime = true;
            if (i < 2) {
                prime = false;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++)
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            if (prime)
                System.out.print(i+" ");
        }
    }
}
