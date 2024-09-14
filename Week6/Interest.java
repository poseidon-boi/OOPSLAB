class Bank {
    double rate;
    double getRateOfInterest() { return rate; }
}

class SBI extends Bank {
    SBI() {
        rate = 2.7;
    }
    double getRateOfInterest() { return rate; }
}

class ICICI extends Bank {
    ICICI() {
        rate = 3;
    }
    double getRateOfInterest() { return rate; }
}

class AXIS extends Bank {
    AXIS() {
        rate = 3;
    }
    double getRateOfInterest() { return rate; }
}

class Interest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();
        System.out.println("SBI rate of interest is: "+sbi.getRateOfInterest());
        System.out.println("ICICI rate of interest is: "+icici.getRateOfInterest());
        System.out.println("AXIS rate of interest is: "+axis.getRateOfInterest());
    }
}
