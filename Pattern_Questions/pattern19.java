package com.google;

public class pattern19 {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){//j-> no of times the data is to be repeated in a single row
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
