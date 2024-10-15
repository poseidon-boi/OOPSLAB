import java.util.Scanner;

class NegativeDistanceException extends Exception {
    NegativeDistanceException(String message) {
        super(message);
    }
}

class Distance {

    double distance;

    Distance(double d) throws NegativeDistanceException {
        if (d < 0)
            throw new NegativeDistanceException("Distance "+d+" is negative");
        distance = d;
    }

    void display() {
        System.out.println("Distance is: "+ distance);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        double dist = scan.nextDouble();
        try {
            Distance distance = new Distance(dist);
            distance.display();
        }
        catch (NegativeDistanceException N) {
            System.out.print("Distance is negative");
        }
    }
}
