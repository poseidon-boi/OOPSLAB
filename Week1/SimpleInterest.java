import java.util.*;
class SimpleInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int P, N, R;
		System.out.print("Enter P, N, R: ");
		P = sc.nextInt();
		N = sc.nextInt();
		R = sc.nextInt();
		System.out.println("The simple interest is "+(P*N*R/100));
	}
}