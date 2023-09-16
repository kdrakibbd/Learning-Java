package examples.listing11_1_4;

public class TestRectangeCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("A circle " + circle.toString());
        circle.setColor("Red");
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        System.out.println("\n");

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        rectangle.setFilled(true);
        rectangle.setColor("blue");
        System.out.println("A rectangle " + rectangle.toString());


    }
}
