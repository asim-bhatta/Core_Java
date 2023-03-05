package Conditional_Statements;

import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottery = (int) (Math.random() * 100);
        System.out.println("Enter your two digit number: ");
        int userInput = sc.nextInt();

        //Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        //Get digits from lottery
        int inputDigit1 = userInput / 10;
        int inputDigit2 = userInput % 10;

        if(userInput == lottery){
        System.out.println("Congratulations! You are awarded $10,000");
        }
        else if(inputDigit1 == lotteryDigit2
             && inputDigit2 == lotteryDigit1){
            System.out.println("Congratulations! You are awarded $3,000");
        }
        else if(inputDigit1 == lotteryDigit2
                || inputDigit2 == lotteryDigit1
                || inputDigit2 == lotteryDigit2
                || inputDigit1 == lotteryDigit1
        ){
            System.out.println("Congratulations! You are awarded $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
        System.out.println("Lottery no is: "+lottery);
    }
}
