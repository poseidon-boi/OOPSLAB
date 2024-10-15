import java.util.Scanner;

class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(), word;
        System.out.print("Enter word to replace with: ");
        word = sc.next();
        StringBuilder strb = new StringBuilder(str);
        for (int i = 0; i < strb.length()-1; i++) {
            char ch = strb.charAt(i);
            int j;
            for (j = 1; i+j < strb.length(); j++)
                if (strb.charAt(i+j) != ch)
                    break;
            if (j != 1)
                strb.replace(i, i+j, word);
            i += word.length()-1;
        }
        System.out.print("New string is: "+ strb);
    }
}
