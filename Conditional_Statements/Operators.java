//Listing 3.6 gives a program that checks whether a number is divisible by 2 and 3, by 2 or
//3, and by 2 or 3 but not both
package Conditional_Statements;

public class Operators {
    public static void main(String[] args) {
        int n = 8;
        if (n % 2 == 0 && n % 3 == 0)
            System.out.println("n is divisible by 2 and 3");
        if (n % 2 == 0 || n % 3 == 0)
            System.out.println("n is divisible by 2 or 3");
        if (n % 2 == 0 ^ n % 3 == 0)
            System.out.println("n is divisible by 2 or 3 but not both");

    }
}
