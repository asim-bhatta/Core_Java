//Area Of Circle Java Program
package Conditional_Statements;

import java.util.Scanner;

public class Circle {
    static double AreaCircle(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("Area of circle is "+ AreaCircle(radius));
    }
}
