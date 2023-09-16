package examples.listing11_5;

public class GeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject () {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified color
     * * and filled value */
    public GeometricObject (String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** retern color */
    public String getColor () {
        return color;
    }

    /** set color */
    public void setColor (String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean, its getter method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString () {
        return "Created on " + dateCreated + "\nColor: " + color + " and filled : " + filled;
    }
}
