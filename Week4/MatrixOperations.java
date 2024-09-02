import java.util.Scanner;
public class MatrixOperations {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n], arr2 = new int[n][n];
        System.out.println("Enter elements of A: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr1[i][j] = sc.nextInt();
        System.out.println("Enter elements of B: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr2[i][j] = sc.nextInt();
        int[][] prod = new int[n][n], sum = new int[n][n];
        for (int i=0; i < n; i++) 
            for (int j = 0; j < n; j++) {
                int s = 0;
                for (int k = 0; k < n; k++)
                    s += arr1[i][k] * arr2[k][j];
                prod[i][j] = s;
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        System.out.println("Product AB:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(prod[i][j]+" ");
            System.out.println();
        }
        System.out.println("Sum A+B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(sum[i][j]+" ");
            System.out.println();
        }
    }
}
