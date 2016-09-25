package project2;

/**
 *
 * @author edward
 */
public class Parallelogram extends Trapezoid {
        
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }
    
    public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }
    
    public double getWidth() {
        /** Points were entered counter-clockwise */
        if(this.getPoint1().getY() == this.getPoint2().getY())
            return Math.abs(this.getPoint2().getX() - this.getPoint1().getX());
        /** Points were entered clockwise */
        else
            return Math.abs(this.getPoint4().getX() - this.getPoint1().getX());
    }
    
    @Override
    public String toString() {
        return  super.toString().substring(0, super.toString().indexOf("Height")) +
                "Width is: " + this.getWidth() + "\n" +
                super.toString().substring(super.toString().indexOf("Height"));
    }
}
