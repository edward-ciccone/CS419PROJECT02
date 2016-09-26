package project2;

/**
 * Represents a Rectangle using four points, it assumes that the points are 
 * stored in a counter-clockwise or clockwise sequence, but <code>point1</code> 
 * is always assumed to be the bottom left point of the Rectangle, in turn this 
 * means <code>point3</code> will always be the top right point. 
 * Also it is assumed that the Rectangles two parallel sides are parallel to 
 * either the x or y axis, and is a determining factor when finding the height, 
 * width, and area.
 * <p>
 * No error catching or handling is implemented, and is assumed that the client 
 * code will  handle this. If any sort of problems do arise during this process,
 * such as points that do not correspond to the shape structure, the inherited 
 * methods <code>getWidth()</code>, <code>getSumOfTwoSides()</code>, 
 * <code>getHeight()</code>, and <code>getArea()</code> will return -1.
 *
 * @author edward
 */
public class Rectangle extends Parallelogram {
    
    /**
     * Constructs a Rectangle from four pairs of x and y values, each pair
     * is used and stored as a Point object. The Rectangle is assumed to hold
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
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }
    
    /**
     * Constructs a Rectangle from four Point objects. The Rectangle is assumed 
     * to hold the values in a clockwise or counter clockwise pattern, and for 
     * its parallel sides to also be parallel with either the x or y axis.
     * 
     * @param point1 always the bottom left point
     * @param point2 bottom right point if counter-clockwise, top left if clockwise
     * @param point3 always the top right point
     * @param point4 top left point if counter-clockwise, bottom right if clockwise
     */
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }
    
    /**
     * Returns the coordinates of the Rectangle in the order they were recieved,
     * the width, the height, and the Area, all properly labeled in a String.
     * 
     * @return the String representation of Rectangle
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
