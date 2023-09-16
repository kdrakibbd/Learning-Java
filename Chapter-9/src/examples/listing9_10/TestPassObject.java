package examples.listing9_10;

class Circle {
    private double radius = 1;

    private static int numberOfObjects = 0;

    Circle () {
        numberOfObjects++;
    }

    public Circle (double newRadius) {
        radius = newRadius;
        numberOfObjects++;

    }

    public double getRadius () {
        return  radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return  radius * radius * Math.PI;
    }
}

public class TestPassObject {

    public static void printAreas(Circle circle , int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(circle.getRadius() + "\t\t" + circle.getArea());
            circle.setRadius(circle.getRadius() + 1);
            times--;
        }
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(1);

        int n = 5;
        printAreas(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);

    }
}
