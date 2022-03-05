
package javaapplication5;

import java.util.Scanner;
public class JavaApplication5 {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        float C = in.nextFloat();
        
        float F = C * (9f / 5) + 32;
        
        System.out.println(F + " degree Farenheit");
    }
    
}
