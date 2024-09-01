import java.util.Scanner;

class TraceNorm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt(), trace = 0;
        double norm = 0;
        System.out.println("Enter the elements:");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                norm = Math.sqrt(norm * norm + arr[i][j] * arr[i][j]);
            }
            trace += arr[i][i];
        }
        System.out.println("Trace = "+ trace +"\nNorm = "+ norm);
    }
}
