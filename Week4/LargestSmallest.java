import java.util.Scanner;

class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        int l, s;
        l = s = arr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > l)
                l = arr[i];
            if (arr[i] < s)
                s = arr[i];
        }
        System.out.println("Largest = "+ l +"\nSmallest = "+ s);
    }
}
