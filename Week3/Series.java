import java.util.Scanner;
class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and number of terms: ");
        double x = sc.nextDouble(), sin = 0, sum = 0, xponent = 1, fact = 1;
        int terms = sc.nextInt();
        for (int i = 1; i < terms*2; i++) {
            fact *= i;
            xponent *= x;
            if(i%2 == 0)
                continue;
            if((i/2)%2 == 0)
                sin += xponent/fact;
            else
                sin -= xponent/fact;
        }
        for (int i=1; i<=terms; i++)
            sum += Math.pow(1.0/i, i);
        System.out.println("sin("+x+") = "+sin+"\nSum = "+sum);
    }
}
