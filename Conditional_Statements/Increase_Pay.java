//Write an if statement that increases pay by 3% if score is greater than 90, otherwise increases pay by 1%.
package Conditional_Statements;

public class Increase_Pay {
    public static void main(String[] args) {
        double score = 92;
        double pay = 10000;
        if (score > 90) {
            pay = pay + (pay * 0.03);
            System.out.println((int)pay);
        } else {
            pay = pay + (pay * 0.01);
            System.out.println(pay);
        }
    }
}
