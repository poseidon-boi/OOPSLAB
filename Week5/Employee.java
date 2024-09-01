import java.util.Scanner;
class Employee {
    String employeeName, city;
    double basic, da, hra, total;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter city: ");
        city = sc.nextLine();
        System.out.print("Enter basic salary, dearness allowance and house rent: ");
        basic = sc.nextDouble();
        da = sc.nextDouble();
        hra = sc.nextDouble();
    }
    void calculate() {
        total = basic + basic * da/100 + basic * hra/100;
    }
    void display() {
        System.out.printf("Name: %s\nCity: %s\nBasic Salary: %.2f\nDearness Allowance: %.2f%%" +
                "\nHouse Rent: %.2f%%\nTotal: %.2f", employeeName, city, basic, da, hra, total);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
        e.calculate();
        e.display();
    }
}
