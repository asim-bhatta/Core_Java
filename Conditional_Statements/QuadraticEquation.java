//Write a program that prompts the user to enter values for a, b, and c and displays
//the result based on the discriminant. If the discriminant is positive, display two
//roots. If the discriminant is 0, display one root. Otherwise, display “The equation
//has no real roots”
package Conditional_Statements;

import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        double r1 = (- b + Math.pow(discriminant, 0.5)) / 2 * a;
        double r2 = (- b - Math.pow(discriminant, 0.5)) / 2 * a;

        if(discriminant > 0){
            System.out.println(r1);
            System.out.println(r2);
        }
        else if(discriminant == 0){
            System.out.println(r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
