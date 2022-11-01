package com.google;

public class pattern14 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {//no of rows
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {// this loop prints one * after another on same line as there is no println here
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
