class Car {
    public void start() {
        System.out.println("The car is starting...");
    }

    public void stop() {
        System.out.println("The car is stopping...");
    }
}

interface ElectricCar {
    void charge();
    void displayCharging();
}

class Tesla extends Car implements ElectricCar {
    public void charge() {
        System.out.println("Car is charging...");
    }

    public void displayCharging() {
        System.out.println("Charging status displayed");
    }
}

public class Main {
    public static void main(String[] args) {
        Tesla t = new Tesla();

        t.start();
        t.charge();
        t.displayCharging();
        t.stop();
    }
}