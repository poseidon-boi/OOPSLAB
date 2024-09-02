import java.util.Scanner;

class Armstrong {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num, sum=0, temp;
        num = sc.nextInt();
        temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        if (sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}