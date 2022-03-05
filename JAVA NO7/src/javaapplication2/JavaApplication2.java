
package javaapplication2;


public class JavaApplication2 {


    public static void main(String[] args) {
    int a1 = 2;
    int b1 = 12;
    int result1 = a1 + b1 / 3;
    System.out.println(result1);
    
    int a2 = 3;
    a2 = a2 + 3;
    int b2 = 2;
    int result2 = a2 - b2;
    System.out.println(result2);
    
    int a3 = 2;
    int b3 = a3 + 1;
    a3 = b3 + 2;
    int result3 = a3 + b3 + a3;
    result3 = -result3;
    System.out.println(result3);
    
    int a4 = 3;
    int b4 = 11;
    int result4 = (b4 % a4) + 1;
    System.out.println(result4);
    
    int a5 = 3;
    int b5 = a5++;
    int result5 = 1;
    result5 += a5 - b5;
    System.out.println(result5);
    
    String s = "jjj";
    String t = "xxx";
    String result6 = s + s + t;
    System.out.println(result6);
    }

   
}

