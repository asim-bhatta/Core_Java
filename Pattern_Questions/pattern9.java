package com.google;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
//This is done by making a matrix and putting the value of i and j like (i,j) and taking the sum of i and j in every box then we found that
       // when the sum is even then the value in box is 1 while when sum is even, then the calue in the box is odd.
//               i=1, j=1
//               i=2, j=1,2
//               i=3, j=1,2,3


        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
