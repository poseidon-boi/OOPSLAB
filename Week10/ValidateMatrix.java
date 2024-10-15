import java.util.Scanner;

class ValidateMatrix {
    static boolean isSquare(int[][] arr) {
        return arr.length == arr[0].length;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter dimensions of matrix: ");
        int m = scan.nextInt(), n = scan.nextInt();
        System.out.println("Enter elements: ");
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = scan.nextInt();
        if (isSquare(arr))
            System.out.print("Square matrix");
        else
            System.out.print("Not a square matrix");
    }
}
