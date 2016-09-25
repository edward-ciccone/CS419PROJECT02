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
public class Square extends Rectangle {
    
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3), new Point(x4, y4));
    }
    
    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
