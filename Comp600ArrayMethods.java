/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author lucchris
 */

public class Comp600ArrayMethods {
    
    
    
    public static int getMinIndex(double[] array){

    if (array.length == 0){
        return -1;
    }
    else{
    int index = 0;
    double value = array[index];

    for (int i = 1; i < array.length; i++){
        if (array[i] <= value){
        value = array[i];
        index = i;
        }
    }
    return index;
    }
  }      
    
    
    
    public static double getMinValue(double[] array){

    if (array.length == 0){
        return -1;
    }
    else{
    int index = 0;
    double value = array[index];

    for (int i = 1; i < array.length; i++){
        if (array[i] <= value){
        value = array[i];
        index = i;
        }
    }
    return value;
    
}
}}

