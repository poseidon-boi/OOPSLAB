import java.util.*;
class SquareRoot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double num, sqrt=0, increment = 100000;
		System.out.print("Enter a number: ");
		num = sc.nextDouble();
		while (increment > 0.000000000001) {
			sqrt += increment;
			if (sqrt*sqrt > num) {
				sqrt -= increment;
				increment /= 10.0;
			}
			if (sqrt*sqrt == num)
				break;
		}
		System.out.println("The square root is "+sqrt);
	}
}