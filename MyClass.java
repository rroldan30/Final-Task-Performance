
package com.mycompany.myclass;

import java.util.Scanner;


public class MyClass {
    public static void main(String args[]) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter FIRST number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter SECOND number: ");
        num2 = sc.nextInt();
        
        if (num1 == num2) {
            System.out.println("\nThe FIRST number is EQUAL to the SECOND number.");
        }
        else if(num1 < num2){
        
            System.out.println("\nThe FIRST number is LESS THAN the SECOND number.");
        }
        else {
            System.out.println("\nThe FIRST number is GREATER THAN the SECOND number.");
        }
      
    }
}