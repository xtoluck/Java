/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Scanner;
/**
 *
 * @author lucchris
 */ 

public class Prog2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter radius of circle: ");
        radius = in.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("Area of the circle is " + Comp600Methods.roundToN(area, 4));
    }
}
