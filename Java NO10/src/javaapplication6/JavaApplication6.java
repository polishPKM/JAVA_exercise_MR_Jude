
package javaapplication6;

import java.util.Scanner;
import java.lang.Math;
public class JavaApplication6 {

    
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The mean value is " + mean(x, y, z)+"\n" );
		System.out.print("The variance value is " + variance(x, y, z)+"\n" );
		System.out.print("The std deviation value is " + stddev(x, y, z)+"\n" );
    }

  public static double mean(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
	
  public static double variance (double x, double y, double z){
	  
	  return ((Math.pow(x - mean(x,y,z),2) + (Math.pow(y - mean(x,y,z),2) + (Math.pow(z - mean(x,y,z),2))))/ 3);

  }
  public static  double stddev(double x, double y, double z){
	  return Math.sqrt((variance(x, y, z)));
  }
}