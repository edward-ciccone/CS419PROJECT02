package project2;

/**
 * Quadrilateral Class that represents a Quadrilateral using four points, it 
 * assumes that the points are stored in a counter-clockwise or clockwise 
 * sequence, but <code>point1</code> is always assumed to be the bottom left
 * point of the Quadrilateral, in turn this means <code>point3</code> will 
 * always be the top right point.
 * <p>
 * No error catching is implemented, and is assumed that the client code will 
 * handle this.
 *
 * @author edward
 */
public class Quadrilateral {
    
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    /**
     * Constructs a Quadrilateral from four pairs of x and y values, each pair
     * is used and stored as a Point object.
     * @param x1 x coordinate for point1
     * @param y1 y coordinate for point1
     * @param x2 x coordinate for point2
     * @param y2 y coordinate for point2
     * @param x3 x coordinate for point3
     * @param y3 y coordinate for point3
     * @param x4 x coordinate for point4
     * @param y4 y coordinate for point4
     */
    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }

    /**
     * Constructs a Quadrilateral from four Point objects.
     * @param point1 always the bottom left point
     * @param point2 bottom right point if counter-clockwise, top left if clockwise
     * @param point3 always the top right point
     * @param point4 top left point if counter-clockwise, bottom right if clockwise
     */
    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    /**
     * Returns the coordinates of the Quadrilateral as a well formated String 
     * representation of the Quadrilateral.
     * @return String representation of Quadrilateral
     */
    @Override
    public String toString() {
        return "Coordinates of " + this.getClass().getSimpleName() + " are:\n"
                + "< " + getPoint1().getX() + ", " + getPoint1().getY() + " >, "
                + "< " + getPoint2().getX() + ", " + getPoint2().getY() + " >, "
                + "< " + getPoint3().getX() + ", " + getPoint3().getY() + " >, "
                + "< " + getPoint4().getX() + ", " + getPoint4().getY() + " >\n";
    }

    /**
     * Always returns the bottom left point.
     * @return point1
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * Returns the bottom right point, if coordinates were entered in a counter-
     * clockwise pattern, otherwise it returns the top left point and assumes
     * points were entered in a clockwise pattern.
     * @return point2
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Always returns the top right point.
     * @return point3
     */
    public Point getPoint3() {
        return point3;
    }

    /**
     * Returns the top left point, if coordinates were entered in a
     * counter-clockwise pattern, otherwise it returns the bottom right point
     * and assumes points were entered in a clockwise pattern.
     * @return point4
     */
    public Point getPoint4() {
        return point4;
    }
}
