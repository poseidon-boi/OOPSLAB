import java.util.Scanner;
class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt(), search, c=0;
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter search element: ");
        search = sc.nextInt();
        System.out.print("Found at index: ");
        boolean found = false;
        for (int i : arr) {
            if (i == search) {
                found = true;
                System.out.print(c+" ");
            }
            c++;
        }
        if (!found)
            System.out.print("None");
    }
}
