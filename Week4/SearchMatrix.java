import java.util.Scanner;

class SearchMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt(), columns = sc.nextInt(), search, count=0;
        System.out.println("Enter the elements:");
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                arr[i][j] = sc.nextInt();
        System.out.print("Enter search element: ");
        search = sc.nextInt();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                if (arr[i][j] == search)
                    count++;
        if (count == 0)
            System.out.println("Element not found");
        else
            System.out.println(count+" occurrences");
    }
}
