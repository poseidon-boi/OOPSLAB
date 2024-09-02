import java.util.*;
class Sign {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int pos=0, neg=0, zero=0;
		int[] num = new int[10];
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
			if (num[i] > 0) pos++;
			else if (num[i] < 0) neg++;
			else zero++;
		}
		System.out.println("The number of positive numbers is "+pos);
		System.out.println("The number of negative numbers is "+neg);
		System.out.println("The number of zeros is "+zero);
	}
}