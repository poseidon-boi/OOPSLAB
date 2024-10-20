import java.util.Scanner;

class ExtendedThread extends Thread {
    @Override
    public void run() {
        System.out.println("In thread created by extending Thread class");
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("In thread created by implementing Runnable");
    }
}

class ThreadMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1. Create thread using Runnable
                2. Create thread by extending Thread""");
        while (true) {
            RunnableThread rth;
            ExtendedThread eth;
            System.out.print("Enter choice: ");
            char ch = scan.next().charAt(0);
            switch (ch) {
                case '1':
                    rth = new RunnableThread();
                    Thread newThread = new Thread(rth);
                    newThread.start();
                    break;
                case '2':
                    eth = new ExtendedThread();
                    eth.start();
                    break;
                case '3':
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
