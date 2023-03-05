//) Suppose you shop for rice in two different packages.
//You would like to write a program to compare the cost. The program prompts the
//user to enter the weight and price of the each package and displays the one with
//the better price.
package Conditional_Statements;

import java.util.*;

public class CompareCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight and price of product A: ");
        int weight1 = sc.nextInt();
        int price1 = sc.nextInt();
        int total1 = weight1 * price1;
        System.out.println("Enter weight and price of product B: ");
        int weight2 = sc.nextInt();
        int price3 = sc.nextInt();
        int total2 = weight1 * price1;
        if(total1 > total2){
            System.out.println("Product A has better price");
        }
        else if(total2 > total1){
            System.out.println("Product B has better price");
        }
        else{
            System.out.println("Both products have same price");
        }
    }
}
