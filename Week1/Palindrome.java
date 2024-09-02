import java.util.*;
class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num, temp, rev=0;
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		temp = num;
		if (num == 0) {
			System.out.println("Palindrome");
			return;
		}
		while (temp>0) {
			rev = rev*10 + (temp % 10);
			temp /= 10;
		}
		if (num == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
		