package Conditional_Statements;

import java.util.*;

public class sortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1>n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        else if (n2>n3){
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.println("Sorted numbers are: "+n1+" "+n2+" "+n3);
    }
}
