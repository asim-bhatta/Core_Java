package com.google;

public class pattern13 {
    public static void main(String[] args) {
        int n = 4; //Half is 4 and other is inverted half of the upper one.

        //For Upper Half
        for(int i=1; i<=n; i++){//no of rows
            for(int j=1; j<=i;j++){//first *
                System.out.print("*");
            }
            int space = 2*(n-i);// middle space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){// last *
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Part invert
        for(int i=n;i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(n-i);
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
