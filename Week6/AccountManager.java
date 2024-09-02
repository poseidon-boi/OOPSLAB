import java.util.Scanner;

class Account {
    String name;
    long accno;
    double balance;
    void displayBalance() {
        System.out.println("Balance: "+balance);
    }
    void deposit(double amount) {
        balance += amount;
        displayBalance();
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        displayBalance();
    }
}

class SavingsAccount extends Account {
    double interest;
    private static final int penalty = 150, minimum_balance = 10000;
    static final String type = "Savings";
    SavingsAccount(String n, long a, double b) {
        name = n;
        accno = a;
        balance = b;
        interest = 3.5;
    }
    void depositInterest() {
        double amount = balance * interest / 100.0;
        System.out.println("Interest amount: "+amount);
        balance += amount;
        displayBalance();
    }
    void checkMinimum() {
        if(balance < minimum_balance) {
            if (balance < penalty)
                balance = 0;
            else
                balance -= penalty;
        }
        displayBalance();
    }
}

class CurrentAccount extends Account {
    private static final int penalty = 450, minimum_balance = 25000;
    static final String type = "Current";
    CurrentAccount(String n, long a, double b) {
        name = n;
        accno = a;
        balance = b;
    }
    void checkMinimum() {
        if(balance < minimum_balance) {
            if (balance < penalty)
                balance = 0;
            else
                balance -= penalty;
        }
        displayBalance();
    }
}

class AccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        long accno = sc.nextLong();
        System.out.print("Enter s for savings and c for current: ");
        char type = sc.next().charAt(0);
        System.out.print("Enter initial balance: ");
        double balance = sc.nextInt(), amount;
        Account acc;
        if (type == 's')
            acc = new SavingsAccount(name, accno, balance);
        else if (type == 'c')
            acc = new CurrentAccount(name, accno, balance);
        else {
            System.out.println("Invalid choice");
            return;
        }
        System.out.println("Created successfully!");
        System.out.print("Enter deposit amount: ");
        amount = sc.nextDouble();
        acc.deposit(amount);
        System.out.print("Enter withdrawal amount: ");
        amount = sc.nextDouble();
        acc.withdraw(amount);
    }
}