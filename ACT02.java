package com.mycompany.act02;

import java.util.Scanner;


public class ACT02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter MAX numbers to display: ");
        
        int n = sc.nextInt();

        display_num(1, n);
        
        System.out.print(n + ".");
        
        System.out.print("\n\nBecause the user entered " + n + ", " + "it will display all numbers from 1 to " + n + ".");
    }

    static void display_num(int min, int max) {
        
        if (min <= max-1) {
            
            System.out.print(min + ", ");
        
            display_num(min + 1, max );
        
        }
    }
}