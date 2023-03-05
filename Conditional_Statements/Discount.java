package Conditional_Statements;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of product: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount of product in %: ");
        double discount = sc.nextDouble();
        double priceAfterDiscount = (discount / 100) * price;
        System.out.println("Your discount in this product is: "+priceAfterDiscount);
    }
}
