package examples.listing11_7;

import examples.listing11_1_4.Circle;
import examples.listing11_1_4.Rectangle;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        displayObject(object1);
        displayObject(object2);
    }

    /** A method for displaying an object */
    public static void displayObject (Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle)object).getArea());
            System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }
    }
}
