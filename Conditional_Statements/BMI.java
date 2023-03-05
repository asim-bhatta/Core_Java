//Write a program that prompts the user to enter a weight in pounds and height in inches and
//displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254
//meters.
//BMI Interpretation
//BMI < 18.5 Underweight
//18.5 ≤ BMI < 25.0 Normal
//25.0 ≤ BMI < 30.0 Overweight
//30.0 ≤ BMI Obese
package Conditional_Statements;
import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        double weightInPounds = sc.nextDouble();
        double weightInKilogram = weightInPounds * 0.45359237;
        System.out.println("Enter height in inches");
        double heightInInches = sc.nextDouble();
        double heightInMeters = heightInInches * 0.0254;
        double BMI = weightInKilogram / (heightInMeters * heightInMeters);
        System.out.println("BMI is: "+BMI);

        if(BMI < 18.5){
            System.out.println("Underweight");
        }
        else if(BMI < 25.0){
            System.out.println("Normal");
        }
        else if(BMI < 30.0){
            System.out.println("Overweight");
        }
        else if(BMI >= 30.0){
            System.out.println("Obese");
        }
    }
}
