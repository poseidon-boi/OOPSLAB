import java.util.Scanner;
class Number {
    private final double num;
    Number(double n) {
        num = n;
    }
    boolean isZero() { return num == 0; }
    boolean isPositive() { return num > 0; }
    boolean isNegative() { return num < 0; }
    boolean isOdd() { return num % 2 != 0; }
    boolean isEven() { return num % 2 == 0; }
    boolean isPrime() {
        if (num < 2)
            return false;
        for (int i=2; i <= Math.sqrt(num); i++)
            if(num % i == 0)
                return false;
        return true;
    }
    boolean isArmstrong() {
        int temp = (int) num, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        if (sum == num)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        Number no = new Number(n);
        System.out.println("isPrime() = "+no.isPrime());
        System.out.println("isArmstrong() = "+no.isArmstrong());
    }
}
