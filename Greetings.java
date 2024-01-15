

package com.mycompany.greetings;

import java.util.PriorityQueue;
import java.util.Scanner;


public class Greetings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> nickNames = new PriorityQueue<>();

        System.out.println("Enter four names of your classmates: ");
        for (int i = 0; i < 4; i++) {
            nickNames.add(scanner.nextLine());
        }

        System.out.println("Enter 'H' to say 'Hi' each of them!");
        while (!nickNames.isEmpty()) {
            String greetings = scanner.next().toUpperCase();
            
            if(greetings.equals("H".equals("h")));
            System.out.println("Hi, " + nickNames.remove().toUpperCase() + "!");
         
        }
        System.out.println("Done Saying Hi.");
    }
}