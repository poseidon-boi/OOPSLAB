import java.util.Scanner;
class Time {
    int hour, min, sec;
    Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }
    Time(int h, int m, int s) {
        hour = h;
        min = m;
        sec = s;
    }
    static Time add(Time t1, Time t2) {
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.min = t1.min + t2.min;
        sum.sec = t1.sec + t2.sec;
        sum.min += sum.sec/60;
        sum.hour += sum.min/60;
        sum.hour %= 24;
        sum.min %= 60;
        sum.sec %= 60;
        return sum;
    }
    void display() {
        System.out.printf("%02d:%02d:%02d", this.hour, this.min, this.sec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time 1: ");
        int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
        Time t1 = new Time(h, m, s);
        System.out.print("Enter time 2: ");
        h = sc.nextInt(); m = sc.nextInt(); s = sc.nextInt();
        Time t2 = new Time(h, m, s), sum;
        sum = add(t1, t2);
        System.out.print("The sum is ");
        sum.display();
    }
}
