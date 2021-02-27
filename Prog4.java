/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author lucchris
 */ 

import java.util.Scanner;

public class Prog4 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "mirror";
        String s2 = "rorrim";
        char c = 'r';

        int n = Comp600Methods.charCount(s1, c);
        System.out.println("Number of occurence of " + c + " in " + s1 + " is " + n);
        System.out.println("Is reversed: " + Comp600Methods.isReversed(s1, s2));
        System.out.println("Is equal: " + Comp600Methods.equalsIgnoreCase(s1, "MiRror"));
    }
    
}
