import java.util.Scanner;

class Diagonal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        System.out.print("Diagonal elements: ");
        int sum = 0;
        for (int i = 0; i < m && i < n; i++) {
            System.out.print(arr[i][i] + " ");
            sum += arr[i][i];
        }
        System.out.println("\nThe sum is: "+sum);
    }
}
