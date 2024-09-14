import java.util.Scanner;

class Student {
    String name;
    int age;
    long regno;
    int semester;
    double fees;
    static int totalAdmissions;
}

class UG extends Student {
    static int admissions;
    UG (String n, int a, long r, int s, double f) {
        name = n;
        age = a;
        regno = r;
        semester = s;
        fees = f;
        admissions++;
        totalAdmissions++;
    }
}

class PG extends Student {
    static int admissions;
    PG (String n, int a, long r, int s, double f) {
        name = n;
        age = a;
        regno = r;
        semester = s;
        fees = f;
        admissions++;
        totalAdmissions++;
    }
}

class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter details of student:\nName: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Registration number: ");
            long regno = sc.nextLong();
            System.out.print("Semester: ");
            int semester = sc.nextInt();
            System.out.print("Fees: ");
            double fees = sc.nextDouble();
            System.out.print("Type(u for UG and p for PG): ");
            char type = sc.next().charAt(0);
            Student stud;
            switch (type) {
                case 'u':
                    stud = new UG(name, age, regno, semester, fees);
                    break;
                case 'p':
                    stud = new PG(name, age, regno, semester, fees);
                    break;
                default:
                    System.out.println("Invalid type");
            }
            if (type == 'u' || type == 'p')
                System.out.println("Student added successfully!");
            System.out.println("Enter 1 to exit: ");
            int exit = sc.nextInt();
            if (exit == '1')
                break;
            sc.nextLine();
        } while(true);
        System.out.printf("Total = %d\nPG = %d\nUG = %d", Student.totalAdmissions, UG.admissions, PG.admissions);
    }
}
