package com.google;

public class pattern10{
    public static void main(String[] args) {
        int n = 5;
        int m = 9;

        //Outer loop
        for(int i=1; i<=n; i++){
            //Inner Loop -> Space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -> *
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        }
