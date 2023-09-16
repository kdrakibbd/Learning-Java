package more_example.casting.vehicle;

abstract class Vehicle {
    String name;
    String color;

    public Vehicle(String name, String color ) {
        this.name = name;
        this.color = color;
    }

    public abstract void drive();
    public abstract void stop();
    public abstract void horn();

    public void printInfo() {
        System.out.println("Vehicle Name :"+name);
        System.out.println("Color : "+color);
    }
}
