package more_example.casting.vehicle;

public class Bike extends Vehicle {
    int gear = 0;

    public Bike(String name, String color) {
        super(name, color);
    }

    // own behavior
    public void gearUp() {
        if (this.gear >= 0 && this.gear < 5) {
            this.gear++;
            System.out.println("Bike is riding at "+this.gear);
        }
    }

    public void gearDown() {
        if (this.gear > 0 && this.gear <= 5) {
            this.gear--;
            System.out.println("Bike is riding at "+this.gear);
        } else {
            System.out.println("Gear is neutral");
        }
    }

    @Override
    public void drive() {
        gearUp();
    }

    @Override
    public void stop() {
        this.gear = 0;
        System.out.println("Bike is stopping");
    }

    @Override
    public void horn() {
        System.out.println("Bike horn . . ");
    }
}
