//*****
//*****
//*****
//*****
package com.google;

public class pattern1 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) { //for no of rows
            for (int j = 1; j < m; j++) {
                System.out.print( "*"); //No ln here as we have to print 5 * on the same line
            }
            System.out.println(); //No * here
        }
    }
}
