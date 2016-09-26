package project2;

/**
 * Represents a Trapezoid using four points, it 
 * assumes that the points are stored in a counter-clockwise or clockwise 
 * sequence, but <code>point1</code> is always assumed to be the bottom left
 * point of the Trapezoid, in turn this means <code>point3</code> will 
 * always be the top right point. Also it is assumed that the Trapezoids two 
 * parallel sides are parallel to either the x or y axis, and is a 
 * determining factor when finding the height and area.
 * <p>
 * No error catching or handling is implemented, and is assumed that the client 
 * code will  handle this. If any sort of problems do arise during this process,
 * such as points that do not correspond to the shape structure, methods
 * <code>getSumOfTwoSides()</code>, <code>getHeight()</code>, and 
 * <code>getArea()</code> will return -1.
 *
 * @author edward
 */
public class Trapezoid extends Quadrilateral {
    
    /**
     * Constructs a Trapezoid from four pairs of x and y values, each pair
     * is used and stored as a Point object. The Trapezoid is assumed to hold
     * the values in a clockwise or counter clockwise pattern, and for its 
     * parallel sides to also be parallel with either the x or y axis.
     * 
     * @param x1 x coordinate for point1
     * @param y1 y coordinate for point1
     * @param x2 x coordinate for point2
     * @param y2 y coordinate for point2
     * @param x3 x coordinate for point3
     * @param y3 y coordinate for point3
     * @param x4 x coordinate for point4
     * @param y4 y coordinate for point4 
     */
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }
    
    /**
     * Constructs a Trapezoid from four Point objects. The Trapezoid is assumed 
     * to hold the values in a clockwise or counter clockwise pattern, and for 
     * its parallel sides to also be parallel with either the x or y axis.
     * 
     * @param point1 always the bottom left point
     * @param point2 bottom right point if counter-clockwise, top left if clockwise
     * @param point3 always the top right point
     * @param point4 top left point if counter-clockwise, bottom right if clockwise
     */
    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }
    
    /**
     * Returns the coordinates of the Trapezoid in the order they were recieved,
     * the height, and the Area, all properly labeled in a String.
     * 
     * @return the String representation of Trapezoid
     */
    @Override
    public String toString() {
        return super.toString() 
                + "Height is: " + this.getHeight() + "\n"
                + "Area is: " + this.getArea() + "\n";
    }
    
    /**
     * Returns the sum of the two parallel sides and is dependent among which
     * order the points were entered (clockwise or counter clockwise), as
     * well as if the shape is parallel to either the x or y axis.
     * If something went wrong while creating the shape, -1 is returned.
     * 
     * @return The sum of the two parallel sides
     */
    protected double getSumOfTwoSides() {
        /* Points were entered counter clockwise, and parallel to x axis */
        if(this.getPoint1().getY() == this.getPoint2().getY()) {
            return  (this.getPoint2().getX() - this.getPoint1().getX()) +
                    (this.getPoint3().getX() - this.getPoint4().getX());
        }
        /* Points were entered clockwise, and parallel to x axis */
        else if(this.getPoint1().getY() == this.getPoint4().getY()) {
            return  (this.getPoint4().getX() - this.getPoint1().getX()) +
                    (this.getPoint3().getX() - this.getPoint2().getX());
        }
        /* Points were entered counter clockwise, and parallel to y axis */
        else if(this.getPoint1().getX() == this.getPoint4().getX()) {
            return  (this.getPoint4().getY() - this.getPoint1().getY()) +
                    (this.getPoint3().getY() - this.getPoint2().getY());
        }
        /* Points were entered clockwise, and parallel to y axis */
        else if(this.getPoint1().getX() == this.getPoint2().getX()) {
            return  (this.getPoint2().getY() - this.getPoint1().getY()) +
                    (this.getPoint3().getY() - this.getPoint4().getY());
        }
        /* Points were not entered correctly */
        else {
            return -1;
        }
    }
    
    /**
     * Returns the area as a double, assuming everything went as expected. If 
     * any invalid points were recieved a -1 will be returned.
     * 
     * @return the area
     */
    public double getArea() {
        /* Something went wrong */
        if(this.getSumOfTwoSides() == -1 || this.getHeight() == -1)
            return -1;
        else
            return (this.getSumOfTwoSides() / 2.0) * this.getHeight();
    }
    
    /**
     * Returns the length between the two parallel sides, and is dependent
     * among which axis the two parallel sides are parallel to. Since 
     * <code>point1</code> is always assumed to be the bottom left point, and in
     * turn makes <code>point3</code> always the top right point, the method
     * just needs to determine if the two parallel sides are parallel with the
     * x or y axis and then can compute the height using only points 1 and 3.
     * If they are parallel with the x axis, the height is found from subtracting
     * point 3's y value from point 1's y value.
     * If they are parallel with the y axis, the height is found from subtracting
     * point 3's x value from point 1's x value.
     * 
     * @return the height
     */
    public double getHeight() {
        /* Points were entered parallel to x axis. */
        if(this.getPoint1().getY() == this.getPoint2().getY() || 
                this.getPoint1().getY() == this.getPoint4().getY()) {
            return this.getPoint3().getY() - this.getPoint1().getY();
        }
        /* Points were entered parallel to y axis. */
        else if(this.getPoint1().getX() == this.getPoint2().getX() || 
                this.getPoint1().getX() == this.getPoint4().getX()) {
            return this.getPoint3().getX() - this.getPoint1().getX();
        }
        /* Something went wrong. */
        else {
            return -1;
        }
    }
}
