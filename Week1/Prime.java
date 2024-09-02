import java.util.*;
class Prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		if (num < 2) {
			System.out.println("Not prime");
			return;
		}
		for (int i=2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("Prime");
	}
}