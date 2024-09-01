import java.util.Scanner;
class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four digits: ");
        int[] a = new int[4];
        for (int i = 0; i < 4; i++)
            a[i] = sc.nextInt()%10;
        System.out.print("Enter choice(1-Repeating, 2-Unique): ");
        int c = sc.nextInt();
        switch(c) {
            case 1:
                int count=0;
                for (int i = 0; i < 4; i++)
                    for (int j = 0; j < 4; j++)
                        for (int k = 0; k < 4; k++)
                            for (int l = 0; l < 4; l++)
                                System.out.printf("%d%d%d%d\n", a[i], a[j], a[k], a[l]);
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (j==i) continue;
                        for (int k = 0; k < 4; k++) {
                            if (k==j || k==i) continue;
                            for (int l = 0; l < 4; l++) {
                                if (l==k || l==j || l==i) continue;
                                System.out.printf("%d%d%d%d\n", a[i], a[j], a[k], a[l]);
                            }
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
