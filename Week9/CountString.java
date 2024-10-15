import java.util.Scanner;

class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int chars = str.length(), words = 1, lines = 1, vowels = 0;
        for (int i = 0; i < chars; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
                continue;
            }
            if (i == 0) {
                if (ch == ' ')
                    words--;
                continue;
            }
            if (ch == ' ') {
                if (i + 1 == chars)
                    break;
                if (str.charAt(i+1) != ' ')
                    words++;
            }
        }
        System.out.printf("Characters: %d\nWords: %d\nLines: %d\nVowels: %d", chars, words, lines, vowels);
    }
}
