import java.util.Scanner;
class Complex {
    int real, imaginary;
    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }
    static Complex add(int a, Complex c) {
        int real = c.real + a;
        return new Complex(real, c.imaginary);
    }
    static Complex add(Complex c1, Complex c2) {
        int real = c1.real + c2.real, i = c1.imaginary + c2.imaginary;
        return new Complex(real, i);
    }
    void display() {
        System.out.printf("%d + %di\n", this.real, this.imaginary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary parts of first number: ");
        int r = sc.nextInt(), i = sc.nextInt();
        Complex c1 = new Complex(r, i);
        System.out.print("Enter real number to add: ");
        r = sc.nextInt();
        Complex sum = add(r, c1);
        System.out.print("Sum is: ");
        sum.display();
        System.out.print("Enter complex number to add: ");
        r = sc.nextInt();
        i = sc.nextInt();
        Complex c2 = new Complex(r, i);
        sum = add(c1, c2);
        System.out.print("Sum is: ");
        sum.display();
    }
}
