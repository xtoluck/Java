/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.*;
/**
 *
 * @author lucchris
 */
public class Program1 { 
    
    /*Write a program that populates an array with 20 integers, computes their average and finds out how many numbers 
    are above average. 
*/
    public static void main(String[] args) 
    {
        System.out.println("How many numbers do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         
        /* Declaring array of n elements, the value
         * of n is provided by the user
         */
        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        } 
        double average=total/arr.length;
      System.out.println("The average of the array is: " + average);
      System.out.println("The numbers in the array that are greater than the average are: ");
      for(int i = 0; i < arr.length; i++) {
      if(arr[i] > average) {
        System.out.println(arr[i]);
      }
    }
	}
}