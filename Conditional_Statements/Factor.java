//Input a number and print all the factors of that number (use loops).
package Conditional_Statements;

import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i+" ");
            }
        }
    }
}
