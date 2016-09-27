/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author edward
 */
public class Driver {

    static Point[] p = {new Point(0, 0), new Point(0, 0), new Point(0, 0), new Point(0, 0)};
    static DecimalFormat df = new DecimalFormat("#.#");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * arg0: 0 = clockwise, 1 = counter-clockwise arg1: 0 = parallel to x, 1
         * = parallel to y
         */
        for (int i = 0; i < 4; i++) {
            trapezoids(0, 0);
            trapezoids(0, 1);
            trapezoids(1, 0);
            trapezoids(1, 1);
        }

        for (int i = 0; i < 4; i++) {
            parallelogram(0, 0);
            parallelogram(0, 1);
            parallelogram(1, 0);
            parallelogram(1, 1);
        }

        for (int i = 0; i < 4; i++) {
            rectangle(0, 0);
            rectangle(0, 1);
            rectangle(1, 0);
            rectangle(1, 1);
        }

        for (int i = 0; i < 4; i++) {
            square(0);
            square(1);
            square(0);
            square(1);
        }
    }

    /**
     * if i is 1, counter clockwise; else counterclockwise. if j is 0, parallel
     * to x axis.
     *
     * @param i
     * @param j
     */
    private static void trapezoids(int i, int j) {
        Random r = new Random();
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(0, 0);

        double x1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));
        double y1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));
        p1.setX(x1);
        p1.setY(y1);
        /**
         * p1 x and y set right bottom x is > 1 left top y is > 1
         */
        double rbx = Double.valueOf(df.format((r.nextDouble() * 5 + 1) + p1.getX()));
        double rby = 0;
        double ltx = 0;
        double lty = Double.valueOf(df.format((r.nextDouble() * 5 + 1) + p1.getY()));

        /* if parallel to x axis --- j == 0 */
        if (j == 0) {
            rby = p1.getY(); // rbx, rby set
            ltx = Double.valueOf(df.format(r.nextDouble() * 10 + 1));
            p3.setY(lty); // null, y set
            p3.setX(Double.valueOf(df.format((r.nextDouble() * 10 + 1) + ltx)));

            /* if i == 1 counter clockwise; rbx and rby is p2 */
            if (i == 1) {
                System.out.println("Parallel to x-axis, counter-clockwise");
                setPoint(p2, rbx, rby);
                setPoint(p4, ltx, lty);
            }

            if (i == 0) {
                System.out.println("Parallel to x-axis, clockwise");
                setPoint(p2, ltx, lty);
                setPoint(p4, rbx, rby);
            }

            Trapezoid t = new Trapezoid(p1, p2, p3, p4);
            System.out.println(t.toString());
        }

        /* if parallel to y axis --- j == 1 */
        if (j == 1) {
            ltx = p1.getX();
            rby = Double.valueOf(df.format(r.nextDouble() * 10 + 1));
            p3.setX(rbx);
            p3.setY(Double.valueOf(df.format((r.nextDouble() * 10 + 1) + rby)));

            /* if i == 1 counter clockwise; rbx and rby is p2 */
            if (i == 1) {
                System.out.println("Parallel to y-axis, counter-clockwise");
                setPoint(p2, rbx, rby);
                setPoint(p4, ltx, lty);
            }

            if (i == 0) {
                System.out.println("Parallel to y-axis, clockwise");
                setPoint(p2, ltx, lty);
                setPoint(p4, rbx, rby);
            }
            Trapezoid t = new Trapezoid(p1, p2, p3, p4);
            System.out.println(t.toString());
        }
    }

    private static void setPoint(Point p, double x, double y) {
        p.setX(x);
        p.setY(y);
    }

    /**
     * if i is 1, counter clockwise; else counterclockwise. if j is 0, parallel
     * to x axis.
     *
     * @param i
     * @param j
     */
    private static void parallelogram(int i, int j) {
        Random r = new Random();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(0, 0);

        double x1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));
        double y1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));
        p1.setX(x1);
        p1.setY(y1);

        int offset = r.nextInt(5);
        double base = 0;
        /**
         * p1 x and y set right bottom x is > 1 left top y is > 1
         */
        double rbx = 0;
        double rby = 0;
        double ltx = 0;
        double lty = 0;
        //double lty = Double.valueOf(df.format((r.nextDouble() * 5 + 1) + p1.getY()));

        /* parallel to x */
        if (j == 0) {
            rby = p1.getY();
            rbx = Double.valueOf(df.format((r.nextDouble() * 10 + 1) + p1.getX()));
            base = rbx - p1.getX();
            ltx = p1.getX() + offset;
            lty = Double.valueOf(df.format((r.nextDouble() * 10 + 1) + p1.getY()));
            p3.setX(ltx + base);
            p3.setY(lty);
            /* counterclockwise */
            if (i == 1) {
                System.out.println("Parallel to x-axis, counter-clockwise");
                setPoint(p2, rbx, rby);
                setPoint(p4, ltx, lty);
            }
            /* clockwise */
            if (i == 0) {
                System.out.println("Parallel to x-axis, clockwise");
                setPoint(p2, ltx, lty);
                setPoint(p4, rbx, rby);
            }
            Parallelogram p = new Parallelogram(p1, p2, p3, p4);
            System.out.println(p.toString());
        }
        /* parallel to y */
        if (j == 1) {
            ltx = p1.getX();
            lty = Double.valueOf(df.format((r.nextDouble() * 10 + 1) + p1.getY()));
            base = lty - p1.getY();
            rby = p1.getY() + offset;
            rbx = Double.valueOf(df.format((r.nextDouble() * 10 + 1) + p1.getX()));
            p3.setX(rbx);
            p3.setY(rby + base);
            /* counterclockwise */
            if (i == 1) {
                System.out.println("Parallel to y-axis, counter-clockwise");
                setPoint(p2, rbx, rby);
                setPoint(p4, ltx, lty);
            }
            /* clockwise */
            if (i == 0) {
                System.out.println("Parallel to y-axis, clockwise");
                setPoint(p2, ltx, lty);
                setPoint(p4, rbx, rby);
            }
            Parallelogram p = new Parallelogram(p1, p2, p3, p4);
            System.out.println(p.toString());
        }
    }

    private static void rectangle(int i, int j) {
        Random r = new Random();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(0, 0);

        double x1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));
        double y1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));
        p1.setX(x1);
        p1.setY(y1);

        double rbx = 0;
        double rby = 0;
        double ltx = 0;
        double lty = 0;

        if (j == 0) {
            // x
            rbx = Double.valueOf(df.format((r.nextDouble() * 10 + 1) + p1.getX()));
            rby = p1.getY();
            ltx = p1.getX();
            lty = Double.valueOf(df.format((rbx / 2) + p1.getY()));
            p3.setX(rbx);
            p3.setY(lty);
            /* counterclockwise */
            if (i == 1) {
                System.out.println("Parallel to x-axis, counter-clockwise");
                setPoint(p2, rbx, rby);
                setPoint(p4, ltx, lty);
            }
            /* clockwise */
            if (i == 0) {
                System.out.println("Parallel to x-axis, clockwise");
                setPoint(p2, ltx, lty);
                setPoint(p4, rbx, rby);
            }
        }

        if (j == 1) {
            // y
            ltx = p1.getX();
            lty = Double.valueOf(df.format((r.nextDouble() * 10 + 1) + p1.getY()));
            rbx = Double.valueOf(df.format((lty / 2) + p1.getX()));
            rby = p1.getY();
            p3.setX(rbx);
            p3.setY(lty);
            /* counterclockwise */
            if (i == 1) {
                System.out.println("Parallel to x-axis, counter-clockwise");
                setPoint(p2, rbx, rby);
                setPoint(p4, ltx, lty);
            }
            /* clockwise */
            if (i == 0) {
                System.out.println("Parallel to x-axis, clockwise");
                setPoint(p2, ltx, lty);
                setPoint(p4, rbx, rby);
            }
        }
        Rectangle p = new Rectangle(p1, p2, p3, p4);
        System.out.println(p.toString());
    }

    private static void square(int i) {
        Random r = new Random();

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(0, 0);

        double x1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));
        double y1 = Double.valueOf(df.format(r.nextDouble() * 3 + 1));

        int sideLength = r.nextInt(10);

        p1.setX(x1);
        p1.setY(y1);

        double rbx = x1 + sideLength;
        double rby = y1;
        double ltx = x1;
        double lty = y1 + sideLength;

        p3.setX(rbx);
        p3.setY(lty);

        if (i == 0) {
            // counter
            System.out.println("Counter-clockwise");
            setPoint(p2, rbx, rby);
            setPoint(p4, ltx, lty);
        }

        if (i == 1) {
            // clock
            System.out.println("Clockwise");
            setPoint(p2, ltx, lty);
            setPoint(p4, rbx, rby);
        }
        Square s = new Square(p1, p2, p3, p4);
        System.out.println(s.toString());
    }

}
