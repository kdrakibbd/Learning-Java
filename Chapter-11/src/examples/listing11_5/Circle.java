package examples.listing11_5;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    // get radius
    public double getRadius() {
        return radius;
    }

    // set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // return area
    public double getArea () {
        return radius * radius * Math.PI;
    }

    // return Diameter
    public double getDiameter () {
        return 2 * radius;
    }

    // return perimeter
    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    /** Print the circle info */
    public void printCircle () {
        System.out.println("The circle is created " +getDateCreated() + " and the radius is "+ radius);
    }

}
