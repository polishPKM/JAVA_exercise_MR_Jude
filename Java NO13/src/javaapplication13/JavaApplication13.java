
package javaapplication13;

import java.util.Scanner;
import java.lang.Math;

public class JavaApplication13 {

    public static void main(String[] args) {
        System.out.print("Enter coefficients: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(),
               b = scanner.nextDouble(),
               c = scanner.nextDouble();
        double det = b * b - 4 * a * c;
        if (det > 0) { // there is more than soln
            double x0 = - b - Math.sqrt(det),
            x1 = - b + Math.sqrt(det);
            x0 /= 2 * a;
            x1 /= 2 * a;
                System.out.printf(
                "x0 = %.4f, x1 = %.4f\n", x0, x1
);
} else if (det == 0) {
    System.out.printf(
            "x = %.4f\n", - b / (2 * a)
);
} else {
       System.out.printf(  "There are no solutions\n");

    }
    }  
}
