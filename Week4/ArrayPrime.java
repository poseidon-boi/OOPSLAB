import java.util.Scanner;

class ArrayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("The prime numbers are: ");
        for (int i = 0; i < n; i++) {
            boolean prime = arr[i] >= 2;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++)
                if (arr[i] % j == 0) {
                    prime = false;
                    break;
                }
            if (prime) System.out.print(arr[i]+" ");
        }
    }
}
