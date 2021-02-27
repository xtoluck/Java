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
public class Comp600Methods {
	public static double round(double num) {
	    num = num * 100.0;
	    num = num + 0.5;
	    return (int)num / 100.0;
	}
	
	public static double roundToN(double num, int places) {
	    num = num * Math.pow(10, places);
	    num = num + 0.5;
	    return (int)num / Math.pow(10, places);
	}
	
	public static double Celsius(double fahrenheit_temperature) {
	    return (5.0 / 9.0) * (fahrenheit_temperature - 32);
	}

	public static double Fahrenheit(double celsius_temperature) {
	    return (9.0 / 5.0) * (celsius_temperature + 32);
	}

    public static int charCount( String s, char c) {
        // This method accepts a string and counts number of times c appears in s.
        int count = 0;
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count = count + 1;
            }
        }
        return count;
    }
    
    public static boolean isReversed( String s1, String s2) {
        // This method returns true if s2 is an exact reverse of s1.
        // i.e. (mirror and rorrim) would return true.
        if (s1.length() != s2.length()) {
            return false;
        }
        else {
            boolean status = true;
            int j = s2.length() - 1; // index to count down
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(j-i)) {
                    status = false;
                    break;
                }
            }
            return status;
        }
    }
    public static boolean equalsIgnoreCase(String s1, String s2) {
        // This method returns true if s1 equals s2, ignoring case.
        return s1.toLowerCase().equals(s2.toLowerCase());
    }

}
