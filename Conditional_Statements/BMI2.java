////(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
////let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
////inches, you will enter 5 for feet and 10 for inches.
package Conditional_Statements;

import java.util.*;

public class BMI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in feet: ");
        double feet = sc.nextDouble();
        double feetToMeters = 1 / 3.28 * feet;
        System.out.println("Enter your height in inches: ");
        double inches = sc.nextDouble();
        double inchesToMeters = 1 / 39.37 * inches;
        double heightInMeters = feetToMeters + inchesToMeters;

        double BMI = weight /(heightInMeters * heightInMeters);
        System.out.println("BMI is: "+BMI);

        if(BMI < 17){
            System.out.println("Underweight");
        }
        else if(17< BMI && BMI < 25) {
            System.out.println("Normal");
        } else if(BMI >25){
            System.out.println("Overweight");
        }

    }
}
