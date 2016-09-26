package project2;

/**
 * Represents a Parallelogram using four points, it 
 * assumes that the points are stored in a counter-clockwise or clockwise 
 * sequence, but <code>point1</code> is always assumed to be the bottom left
 * point of the Parallelogram, in turn this means <code>point3</code> will 
 * always be the top right point. Also it is assumed that the Parallelograms two 
 * parallel sides are parallel to either the x or y axis, and is a 
 * determining factor when finding the height, width, and area.
 * <p>
 * No error catching or handling is implemented, and is assumed that the client 
 * code will  handle this. If any sort of problems do arise during this process,
 * such as points that do not correspond to the shape structure, 
 * <code>getWidth()</code>, and inherited methods <code>getSumOfTwoSides()</code>, 
 * <code>getHeight()</code>, and <code>getArea()</code> will return -1.
 *
 * @author edward
 */
public class Parallelogram extends Trapezoid {
        
    /**
     * Constructs a Parallelogram from four pairs of x and y values, each pair
     * is used and stored as a Point object. The Parallelogram is assumed to hold
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
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }
    
    /**
     * Constructs a Parallelogram from four Point objects. The Parallelogram is assumed 
     * to hold the values in a clockwise or counter clockwise pattern, and for 
     * its parallel sides to also be parallel with either the x or y axis.
     * 
     * @param point1 always the bottom left point
     * @param point2 bottom right point if counter-clockwise, top left if clockwise
     * @param point3 always the top right point
     * @param point4 top left point if counter-clockwise, bottom right if clockwise
     */
    public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }
      
    /**
     * Returns the coordinates of the Parallelogram in the order they were recieved,
     * the width, the height, and the Area, all properly labeled in a String.
     * 
     * @return the String representation of Parallelogram
     */
    @Override
    public String toString() {
        return "Coordinates of " + this.getClass().getSimpleName() + " are:\n"
                + "< " + this.getPoint1().getX() + ", " + this.getPoint1().getY() + " >, "
                + "< " + this.getPoint2().getX() + ", " + this.getPoint2().getY() + " >, "
                + "< " + this.getPoint3().getX() + ", " + this.getPoint3().getY() + " >, "
                + "< " + this.getPoint4().getX() + ", " + this.getPoint4().getY() + " >\n"
                + "Width is: " + this.getWidth() + "\n"
                + "Height is: " + this.getHeight() + "\n"
                + "Area is: " + this.getArea() + "\n";
    }
    
    /**
     * Returns the length of the lines that are perpendicular to the line that
     * measured the height, and is dependent on which axis the parallel sides 
     * reside, as well as if the points were entered in a clockwise or counter 
     * clockwise manner. 
     * If any invalid points were recieved -1 will be returned.
     * 
     * @return the width
     */
    public double getWidth() {
        /* Points were entered counter clockwise and parallel to x axis. */
        if(this.getPoint1().getY() == this.getPoint2().getY()) {
            return this.getPoint2().getX() - this.getPoint1().getX();
        } 
        /* Points were entered clockwise and parallel to x axis. */
        else if(this.getPoint1().getY() == this.getPoint4().getY()) {
            return this.getPoint4().getX() - this.getPoint1().getX();
        }
        /* Points were entered clockwise and parallel to y axis. */
        else if(this.getPoint1().getX() == this.getPoint2().getX()) {
            return this.getPoint2().getY() - this.getPoint1().getY();
        }
        /* Points were entered counter clockwise and parallel to y axis. */
        else if(this.getPoint1().getX() == this.getPoint4().getX()) {
            return this.getPoint4().getY() - this.getPoint1().getY();
        }
        /* Something went wrong. */
        else {
            return -1;
        }
    }
}
