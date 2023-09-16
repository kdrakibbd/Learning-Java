package more_example.casting.vehicle;

class Car extends Vehicle {
    int gear;
    boolean ac;

    public Car(String name, String color) {
        super(name,color);
    }

    // own behavior
    public void acOnOff (boolean enable) {
        this.ac = enable;
    }

    // own behavior
    public void gearChange (int gear) {
        this.gear = gear;
        if (this.gear > 0 && this.gear <= 5) {
            System.out.println("Car is driving at "+this.gear);
        }
        else {
            System.out.println("Gear is neutral");
        }
    }

    @Override
    public void drive() {
        gearChange(1);
    }

    @Override
    public void horn() {
        System.out.println("Car Horn . ..");
    }

    @Override
    public void stop() {
        gearChange(0);
        System.out.println("Car is stopping . . .");
    }
}
