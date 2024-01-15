
package com.mycompany.grocerystorechatbot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class GroceryStoreChatBot {

    public static void main(String[] args) throws InterruptedException {
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Welcome to RZ Grocery Store! ");
        Thread.sleep(2000);
        System.out.print("What is your name? ");
        String name = input.nextLine().toUpperCase();
        Thread.sleep(2000);
        System.out.println("Nice to meet you, "+name+". I'm Nika."); System.out.print("How are you today? ");
        Thread.sleep(2000);
        String feeling = input.nextLine();
        if (feeling.equalsIgnoreCase("good"))
        System.out.println("wow! I feel the same way.");
        else if (feeling.equalsIgnoreCase("great"))
        System.out.println("That's nice to know!");
        else
        System.out.println("Go ahead and do something you love."); Thread.sleep(2000);
        System.out.println("What do you want to purchase?");
        String fave = input.nextLine();
        ArrayList directions = new ArrayList();
        Collections.addAll(directions, "left", "right", "straight ahead", "left and then right", "straight forward and left");
        Collections.shuffle(directions);
        Thread.sleep(2000);
        System.out.println("Okay a " + fave + ". Go " + directions.get(0)+", and there it is, Thank you!.");
            }
        }