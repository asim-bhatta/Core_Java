package com.google;

public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
//Outer loop
        for(int i=1; i<=n; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j);// here j shows the limit of range. i.e. 1-1, 1-2, 1-3...1-5
            }
            System.out.println();
        }
    }
}
