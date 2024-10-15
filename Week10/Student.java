import java.util.Scanner;

class Student {

    String name;
    int rollno;
    int[] marks;
    double percent = 0;

    Student(String n, int r, int[] m) {
        name = n;
        rollno = r;
        marks = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            marks[i] = m[i];
            percent += m[i];
        }
        percent /= m.length;
    }

    double percentage() {
        return percent;
    }

    char grade() {
        if (percent >= 90)
            return 'A';
        if (percent >= 80)
            return 'B';
        if (percent >= 70)
            return 'C';
        if (percent >= 60)
            return 'D';
        if (percent >= 50)
            return 'E';
        else
            return 'F';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scan.nextLine();
        try {
            System.out.print("Enter rollno: ");
            int rollno = Integer.parseInt(scan.next());
            System.out.print("Enter marks: ");
            int[] marks = new int[3];
            for (int i = 0; i < 3; i++)
                marks[i] = Integer.parseInt(scan.next());
            Student s = new Student(name, rollno, marks);
            System.out.println("Percentage is: "+s.percentage());
            System.out.println("Grade is: "+s.grade());
        }
        catch (NumberFormatException N) {
            System.out.print("Not a number");
        }
    }
}