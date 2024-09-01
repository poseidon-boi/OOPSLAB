import java.util.Arrays;
import java.util.Scanner;

class MergeAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int s1 = sc.nextInt();
        int[] arr1 = new int[s1];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < s1; i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the size of array 2: ");
        int s2 = sc.nextInt();
        int[] arr2 = new int[s2];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < s2; i++)
            arr2[i] = sc.nextInt();
        int[] arr3 = new int[s1+s2];
        for (int i = 0; i < s1; i++)
            arr3[i] = arr1[i];
        for (int i = 0; i < s2; i++)
            arr3[s1+i] = arr2[i];
        Arrays.sort(arr3);
        System.out.print("The merged and sorted array is: ");
        for (int i=0; i < s1+s2; i++)
            System.out.print(arr3[i]+" ");
    }
}
