//Suppose you want to develop a program for a first-grader to practice subtraction. The program randomly generates two single-digit integers
package Conditional_Statements;

import java.util.*;

public class SubtractRandomNumbers {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        if(n1 < n2) {
            int temp = n1;//First assign value of n1 to temporary variable
            n1 = n2;//Then assign value of n2 to n1
            n2 = temp;//After that assign value of temp to n2
        }
            Scanner sc = new Scanner(System.in);
            System.out.println("What is "+n1+"-"+n2+"?");
            int answer = sc.nextInt();

            if(n1 - n2 == answer){
                System.out.println("Answer is correct!");
            }
            else{
                System.out.println("Answer is not correct!");
            }
    }
}
