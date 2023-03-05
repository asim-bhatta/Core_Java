//(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
//subtraction question. Revise the program to randomly generate an addition question with two integers less than 100.
package Conditional_Statements;

import java.util.*;

public class randomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = (int) (Math.random() * 100);
        int n2 = (int) (Math.random() * 100);
        System.out.println("What is "+n1+" +"+n2+"?");
        int answer = sc.nextInt();
        int sum = n1 + n2;
        if(answer == sum){
            System.out.println("You are correct");
        }
        else{
            System.out.println("You are wrong");
        }
    }
}
