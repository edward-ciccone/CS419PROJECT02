package project2;

/**
 * Represents a point on a x-y plane using two double values. This object 
 * simply takes in two values, one for the x coordinate and one for the y
 * coordinate, and is stored as a point on a x-y plane.
 * 
 * @author edward
 */
public class Point {
    
    private double x;
    private double y;

    /**
     * Constructs a point on a x-y plane using two double values.
     * 
     * @param x the x value for the Point object
     * @param y the y value for the Point object
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Returns the x value as a double representing the x coordinate for this
     * Point object.
     * 
     * @return the x coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * The x coordinate gets set to the parameter x.
     * 
     * @param x the x coordinate to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Returns the y value as a double representing the y coordinate for this
     * Point object.
     * 
     * @return the y coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * The y coordinate gets set to the parameter y
     * 
     * @param y the y coordinate to set
     */
    public void setY(double y) {
        this.y = y;
    }
}
