import java.util.Arrays;
import java.util.Scanner;

class StringOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("""
                1. Check palindrome
                2. Sort
                3. Reverse
                4. Concatenate with reverse
                Enter choice:\s""");
        char ch = sc.next().charAt(0);
        StringBuilder strb = new StringBuilder(str), rev;
        rev = new StringBuilder(str);
        rev.reverse();
        char[] arr = str.toCharArray();
        switch (ch) {
            case '1':
                for (int i = 0; i < arr.length; i++) {
                    if (rev.charAt(i) != strb.charAt(i)) {
                        System.out.print("Not a palindrome");
                        return;
                    }
                }
                System.out.print("Palindrome");
                break;
            case '2':
                Arrays.sort(arr);
                System.out.print("The sorted array is: ");
                for (char c : arr)
                    System.out.print(c);
                break;
            case '3':
                System.out.print("The reverse is: "+rev);
                break;
            case '4':
                strb.append(rev);
                System.out.print("The new string is: "+strb);
                break;
            default:
                System.out.print("Invalid choice");
        }
    }
}
