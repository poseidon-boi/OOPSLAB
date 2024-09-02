import java.util.Scanner;
public class MatrixSymmetry {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("Not symmetric");
                    return;
                }
        System.out.println("Symmetric");
    }
}
