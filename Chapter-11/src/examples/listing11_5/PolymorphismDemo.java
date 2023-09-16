package examples.listing11_5;


public class PolymorphismDemo {
    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new Circle(1.0, "Red" , true));
        displayObject(new Rectangle(4,5,"Blue",false));
    }

    public static void displayObject (GeometricObject obj) {
        System.out.println("Created on " + obj.getDateCreated() + ". Color is " + obj.getColor());
    }
}
