import java.util.*;
class Converter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int decin, binout=0, binin, decout=0, temp;
		System.out.print("Enter a decimal number: ");
		decin = sc.nextInt();
		temp = decin;
		while (temp>0) {
			binout = binout*10 + (temp % 2);
			temp /= 2;
		}
		System.out.println("Binary is "+binout);
		System.out.println("Enter a binary number: ");
		binin = sc.nextInt();
		temp = binin;
		int pow = 1;
		while (temp>0) {
			binout = binout*10 + temp*pow;
			temp /= 10;
			pow *= 2;
		}
		System.out.println("Decimal is "+decout);
	}
}
		