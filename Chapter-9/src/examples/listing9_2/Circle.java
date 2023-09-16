package examples.listing9_2;

class Circle {
    double radius;

    Circle () {
        radius = 1;
    }

    Circle (double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return  radius * radius * Math.PI;
    }

    double getParimeter () {
        return  2 * radius * Math.PI;
    }

    void setRadius (double newRadius) {
        radius = newRadius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());


        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radisus " + circle2.radius + " is "+ circle2.getArea());

        // create a circle with radisu 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radisus " + circle3.radius + " is "+ circle3.getArea());

        // modify radius value
        circle2.radius = 100;
        System.out.println("The area of the circle fo radius " + circle2.radius+ " is "+ circle2.getArea());
    }
}
