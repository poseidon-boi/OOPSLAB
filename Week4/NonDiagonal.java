import java.util.Scanner;

class NonDiagonal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        System.out.print("Non diagonal elements: ");
        int sum = 0;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i][n-i-1] + " ");
            sum += arr[i][n-i-1];
        }
        System.out.println("\nThe sum is: "+sum);
    }
}