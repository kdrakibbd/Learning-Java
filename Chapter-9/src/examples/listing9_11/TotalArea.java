package examples.listing9_11;

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

public class TotalArea {
    public static void main(String[] args) {
        // Declare circleArray
        Circle[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /** Create an array of Circle objects */
    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i = 0;i < circleArray.length;i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return circleArray;
    }

    /** Print an array of circles and their total area */
    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0;i < circleArray.length;i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("— — — — — — — — — — — — — — — — — — — — — — — — — — — —");

        // Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
    }

    /** Add circle areas */
    public static double sum (Circle[] circleArray) {
        double sum = 0;

        for (int i = 0;i < circleArray.length;i++) {
            sum += circleArray[i].getArea();
        }

        return  sum;
    }
}
