import java.util.Scanner;

class Account {
    String name, type;
    long accno;
    double balance, minimum_balance;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Updated balance: "+balance);
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        amount -= balance;
        System.out.println("Updated balance: "+balance);
    }
}

class SavingsAccount extends Account {
    double interest;
    SavingsAccount(String n, long a, double b) {
        name = n;
        type = "Savings";
        accno = a;
        balance = b;
        interest = 3.5;
        minimum_balance = 10000;
    }
    void depositInterest() {
        double amount = balance * interest / 100.0;
        System.out.println("Interest amount: "+amount);
        balance += amount;
        System.out.println("Updated balance: "+balance);
    }
    void checkMinimum() {
        if(balance < minimum_balance) {
            if (balance < 150)
                balance = 0;
            else
                balance -= 150;
        }
        System.out.println("Updated balance: "+balance);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String n, long a, double b) {
        name = n;
        type = "Current";
        accno = a;
        balance = b;
        minimum_balance = 25000;
    }
    void checkMinimum() {
        if(balance < minimum_balance) {
            if (balance < 450)
                balance = 0;
            else
                balance -= 450;
        }
        System.out.println("Updated balance: "+balance);
    }
}

class AccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        long accno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter s for savings and c for current: ");
        char type = sc.next().charAt(0);
        System.out.print("Enter initial balance: ");
        double balance = sc.nextInt();
        switch (type) {
            case 's':
                SavingsAccount sacc = new SavingsAccount(name, accno, balance);
                System.out.println("Created successfully!");
                break;
            case 'c':
                CurrentAccount cacc = new CurrentAccount(name, accno, balance);
                System.out.println("Created successfully!");
                break;
            default:
                System.out.println("Invalid choice: ");
        }
    }
}