class Car {
    public void startCar() {
        System.out.println("Car has been started");
    }

    public void changeGear() {
        System.out.println("gear has been changed");
    }

    public void accelerate() {
        System.out.println("Accelerate has been given");
    }
}

class LuxuryCar extends Car {
    public void changeGear() {
        System.out.println("Automatic gear has been changed in luxurycar");
    }

    public void openRoof() {
        System.out.println("Roof has been opened");
    }
}

public class MethodOverride2 {
    public static void main(String[] args) {
        Car c = new LuxuryCar();
        c.startCar();
        c.changeGear();
        c.accelerate();
    }
}
