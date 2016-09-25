/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author edward
 */
public class Trapezoid extends Quadrilateral {
    
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }
    
    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }
    
    
    @Override
    public String toString() {
        return super.toString() 
                + "Height is: " + this.getHeight() + "\n"
                + "Area is: " + this.getArea() + "\n";
    }
    
    /**
     * Returns the sum of the two parallel sides.<br>
     * If the points were entered in a counter-clockwise pattern it will return
     * the sum of <code>(point2 - point1) + (point3 - point4)</code><br>
     * If the points were entered in a clockwise pattern it will return the sum 
     * of <code>(point4 - point1) + (point3 - point2)</code>
     * @return The sum of the two parallel sides
     */
    public double getSumOfTwoSides() {
        /** Points were entered counter-clockwise. */
        if(this.getPoint1().getY() == this.getPoint2().getY()) {
            return Math.abs(this.getPoint2().getX() - this.getPoint1().getX()) +
                   Math.abs(this.getPoint3().getX() - this.getPoint4().getX());
        }
        /** Points were entered clockwise. */
        else {
            return Math.abs(this.getPoint4().getX() - this.getPoint1().getX()) + 
                   Math.abs(this.getPoint3().getX() - this.getPoint2().getX());
        }
    }
    
    public double getArea() {
        return (this.getSumOfTwoSides() / 2.0) * this.getHeight();
    }
    
    public double getHeight() {
        /** Points were entered counter-clockwise */
        if(this.getPoint1().getY() == this.getPoint2().getY())
            return Math.abs(this.getPoint3().getY() - this.getPoint2().getY());
        /** Points were entered clockwise */
        else
            return Math.abs(this.getPoint2().getY() - this.getPoint1().getY());
    }
}
