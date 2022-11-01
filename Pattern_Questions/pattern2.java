//*****
//*   *
//*   *
//*****
//Print this pattern
package com.google;

public class pattern2 {
    public static void main(String[] args) {
        int n = 4;//Maximum no of rows
        int m = 5;//Maximum no of column

        //Outer loop
        for(int i=1; i<=n; i++){
            //Inner loop
            for(int j=1; j<=m; j++){
                //cell -> (i,j)
                if(i==1 || j==1 || i==n || j==m){ // It means in these cells, we print *
                    System.out.print("*"); //Again no ln here as we are printing in the same line
                }
                else{ // IN remaining cells, print blank space.
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }