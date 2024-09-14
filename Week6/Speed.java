class Bike {
    int speedlimit;
    Bike() {
        speedlimit = 100;
    }
    void run() {
        System.out.println("Bike speed limit is "+speedlimit);
    }
}

class Splendar extends Bike {
    Splendar() {
        speedlimit = 80;
    }
    void run() {
        System.out.println("Splendar speed limit is "+speedlimit);
    }
}

public class Speed {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Splendar splendar = new Splendar();
        bike.run();
        splendar.run();
    }
}
