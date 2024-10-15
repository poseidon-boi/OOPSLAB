import java.util.Scanner;

class Matrix implements Runnable{
    int[][] arr;
    int operation;
    Matrix(int[][] a, int o) {
        arr = a;
        operation = o;
    }
    void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    void displayTranspose() {
        System.out.println("Transpose:");
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[j][i]+" ");
            System.out.println();
        }
    }
    void displayMaximum() {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                if (arr[i][j] > max)
                    max = arr[i][j];
        System.out.println("Maximum element is: "+max);
    }
    void displayDiag() {
        System.out.print("Diagonal elements: ");
        for (int i = 0; i < arr.length && i < arr[0].length; i++)
            System.out.print(arr[i][i]+" ");
    }
    void displayNonDiag() {
        System.out.print("Non diagonal elements: ");
        for (int i = 0; i < arr.length && i < arr[0].length; i++)
            System.out.print(arr[i][arr[0].length-i-1]+" ");
    }
    public void run() {
        switch (operation) {
            case 1: displayMatrix(); break;
            case 2: displayTranspose(); break;
            case 3: displayMaximum(); break;
            case 4: displayDiag(); break;
            case 5: displayNonDiag(); break;
            default: System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter dimensions of matrix: ");
        int r = scan.nextInt(), c = scan.nextInt();
        System.out.println("Enter elements: ");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = scan.nextInt();
        Matrix[] m = new Matrix[5];
        Thread[] th = new Thread[5];
        for (int i = 0; i < 5; i++) {
            m[i] = new Matrix(arr, i + 1);
            th[i] = new Thread(m[i]);
        }
        for (int i = 0; i < 5; i++)
            th[i].start();
    }
}
