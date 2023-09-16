package examples.listing9_6;

public class CircleWithStaticMembers {
    double radius;

    static int numberOfObjects = 0;

    CircleWithStaticMembers () {
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers (double newRadius) {
        radius = newRadius;
        numberOfObjects++;
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

    static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
