package com.google;

public class pattern15 {
    public static void main(String[] args) {
        int n = 4;
        //First part Outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Part outer loop
        for(int i=n; i>=1; i--){
            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
