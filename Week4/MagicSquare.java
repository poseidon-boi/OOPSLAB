import java.util.Scanner;
public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt(), diagsum = 0, nondiagsum = 0;
        int[][] arr = new int[n][n];
        int[] rowsum = new int[n], colsum = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                rowsum[i] += arr[i][j];
                colsum[j] += arr[i][j];
            }
            diagsum += arr[i][i];
            nondiagsum += arr[i][n-i-1];
        }
        if(diagsum != nondiagsum) {
            System.out.println("Not a magic square");
            return;
        }
        for (int i = 0; i < n; i++)
            if (diagsum != rowsum[i] || diagsum != colsum[i]) {
                System.out.println("Not a magic square");
                return;
            }
        System.out.println("Magic square");
    }
}
