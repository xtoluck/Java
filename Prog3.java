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

public class Prog3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type;
        double temperature, converted_temperature;
        System.out.println("Convert to:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        type = in.nextInt();
        System.out.print("Temperature: ");
        temperature = in.nextDouble();
        if (type == 1) {
            converted_temperature = Comp600Methods.Celsius(temperature);
            converted_temperature = Comp600Methods.roundToN(converted_temperature, 3);
            System.out.println("" + temperature + " degree fahrenheit is " + converted_temperature + " degree celsius");
        }
        else {
            converted_temperature = Comp600Methods.Fahrenheit(temperature);
            converted_temperature = Comp600Methods.roundToN(converted_temperature, 3);
            System.out.println("" + temperature + " degree celsius is " + converted_temperature + " degree fahrenheit");
        }   
    }
}
