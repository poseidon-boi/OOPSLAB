import java.util.Arrays;
import java.util.Scanner;

class ArrayOps {

    private static int size = 10;
    int[] arr = new int[size];

    void getElements() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }
    void display() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    void displayLargest() {
        int largest = arr[0];
        for (int i = 1; i < size; i++)
            if (arr[i] > largest)
                largest = arr[i];
        System.out.println("The largest element is "+largest);
    }
    void displayAverage() {
        double average = 0;
        for (int i = 0; i < size; i++)
            average += (double) arr[i] / (double) size;
        System.out.println("The average element is "+average);
    }
    void sort() {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        ArrayOps obj = new ArrayOps();
        obj.getElements();
        obj.display();
        obj.displayLargest();
        obj.displayAverage();
        obj.sort();
        obj.display();
    }
}
