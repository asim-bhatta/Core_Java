//Greatest Common Divisor
package Conditional_Statements;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 15;
        int GCD = 1;
        int k = 2;

        while (k<=n1 && k<=n2){
            if(n1 % k == 0 && n2 % k == 0)
                GCD = k;
                k++;
        }
        System.out.println("GCD is: "+GCD);
    }
}
