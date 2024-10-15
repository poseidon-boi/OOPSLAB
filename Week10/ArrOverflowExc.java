import java.util.Scanner;

class ArrOverflowExc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt(), index;
        System.out.print("Enter elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = scan.nextInt();
        System.out.print("Enter array index to access: ");
        index = scan.nextInt();
        try {
            System.out.println("Element: "+arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException A) {
            System.out.println("Error: Array index is out of bounds");
        }
        finally {
            System.out.print("Size: "+size);
        }
    }
}
