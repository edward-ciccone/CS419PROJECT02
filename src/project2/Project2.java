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
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrilateral q = new Rectangle(5,5,11,5,12,20,6,20);
        Quadrilateral q1 = new Parallelogram(5,5,6,20,12,20,11,5);
        
        Trapezoid r1 = new Trapezoid(1,1,1,2,2,3,2,0.5);
        Trapezoid r = new Trapezoid(0, 0, 10, 0, 8, 5, 3.3, 5.0);
        
        System.out.println(q.toString());
        System.out.println(q1.toString());
        System.out.println(r.toString());
        System.out.println(r1.toString());
    }

}
