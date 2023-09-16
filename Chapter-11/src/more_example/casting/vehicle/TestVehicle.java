package more_example.casting.vehicle;

public class TestVehicle{
    public static void main(String[] args) {
        testVehicle(new Car("Honda Civic","White"));
        testVehicle(new Bike("R15", "Blue"));
    }

    public static void testVehicle(Vehicle vehicle) {
        System.out.println("\n");

        vehicle.printInfo();
        vehicle.drive();
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.acOnOff(true);
            car.gearChange(3);
        }
        else if (vehicle instanceof Bike) {
            Bike bike = (Bike) vehicle;
            bike.gearUp();
            bike.gearUp();
            bike.gearDown();
        }
        vehicle.horn();
        vehicle.stop();
    }
}
