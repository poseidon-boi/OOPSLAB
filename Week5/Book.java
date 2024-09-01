import java.util.Scanner;
class Book {
    String title, author;
    int edition;
    Book(String t, String a, int e) {
        title = t;
        author = a;
        edition = e;
    }
    void display() {
        System.out.printf("%s, Edition %d - %s\n", this.title, this.edition, this.author);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int num = 6;
        Book[] b = new Book[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter author: ");
            String name = sc.nextLine(), title;
            System.out.print("Enter title: ");
            title = sc.nextLine();
            System.out.print("Enter edition: ");
            int e = sc.nextInt();
            sc.nextLine();
            b[i] = new Book(title, name, e);
        }
        System.out.print("Enter author to search: ");
        String a = sc.nextLine();
        for (int i = 0; i < num; i++)
            if(b[i].author.equals(a))
                b[i].display();
    }
}
