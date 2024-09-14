import java.util.Scanner;
public class Boxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int k = sc.nextInt();
        Integer k1 = k;
        Character c = (char) k;
        char c1 = c;
        System.out.println(k+" "+k1+" "+c+" "+c1);
    }
}
