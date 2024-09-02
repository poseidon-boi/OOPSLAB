class Pattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = i + 1;
        System.out.println("Using for loop: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("Using for-each loop: ");
        for (int i:arr) {
            for (int j = 0; j < i; j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }    
}
