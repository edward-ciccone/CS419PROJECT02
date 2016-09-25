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
        Quadrilateral q = new Quadrilateral(3, 5, 23, 4, 234, 4, 23, 43);
        Quadrilateral q1 = new Parallelogram(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
        
        Rectangle r = new Rectangle(17, 14, 30, 14, 30, 28, 17, 28);
        
        System.out.println(q.toString());
        System.out.println(q1.toString());
        System.out.println(r.toString());
    }

}
