package examples.listing9_1;

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
}