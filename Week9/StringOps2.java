import java.util.Scanner;

class StringOps2 {

    /**
     * Returns the starting position of a substring in a string
     * @param str The original string
     * @param sub The substring
     * @return -1 if not a substring, starting position otherwise
     */
    static int posSubstring(String str, String sub) {
        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; i + j < str.length() && j < sub.length(); j++) {
                if (str.charAt(i+j) != sub.charAt(j))
                    break;
            }
            if (j == sub.length())
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(), str2;
        System.out.print("""
                1. Compare two strings
                2. Toggle case
                3. Check for substring
                4. If substring, replace with 'Hello'
                Enter choice:\s""");
        char ch = sc.next().charAt(0);
        sc.nextLine();
        switch (ch) {
            case '1':
                System.out.print("Enter another string: ");
                str2 = sc.nextLine();
                System.out.print("Difference is: "+str.compareTo(str2));
                break;
            case '2':
                char[] arr = str.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if (Character.isLowerCase(arr[i]))
                        arr[i] = Character.toUpperCase(arr[i]);
                    else if (Character.isUpperCase(arr[i]))
                        arr[i] = Character.toLowerCase(arr[i]);
                }
                System.out.print("The new string is: ");
                for (int i = 0; i < arr.length; i++)
                    System.out.print(arr[i]);
                break;
            case '3':
                System.out.print("Enter another string: ");
                str2 = sc.nextLine();
                if (posSubstring(str, str2) != -1)
                    System.out.print("Substring");
                else
                    System.out.print("Not a substring");
                break;
            case '4':
                System.out.print("Enter another string: ");
                str2 = sc.nextLine();
                int pos = posSubstring(str, str2);
                StringBuilder strb = new StringBuilder(str);
                if (pos != -1)
                    strb.replace(pos, pos + str2.length(), "Hello");
                System.out.print("New string: "+strb);
                break;
            default:
                System.out.print("Invalid choice");
        }
    }
}
