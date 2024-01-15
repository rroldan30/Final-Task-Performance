/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.fruitbasket;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author RZ Roldan
 */
public class FruitBasket {

    public static void main(String[] args) {
        Stack<String> sFruits = new Stack<>();
        Stack<String> sBasket = new Stack<>();

        sFruits.push("Guava");
        sFruits.push("Mango");
        sFruits.push("Orange");
        sFruits.push("Apple");

        String strSelectedFruit;
        String strSelected;
        
        System.out.println("Catch and eat any of these fruits: ('Apple', 'Orange', 'Mango', 'Guava')\n");

        Scanner scFruits = new Scanner(System.in);
        int ix = 0;
        while (ix < 4) {

            System.out.println("Enter which fruit you want to catch: A for Apple, O for Orange, M for Mango, and G for Guava");
            strSelectedFruit = scFruits.next();
            if (sFruits.peek().charAt(0) == strSelectedFruit.charAt(0)) {
                strSelected = sFruits.pop();
                sBasket.push(strSelected);
                System.out.println(strSelected + " is now on the basket");
                ix++;
            } else {
                System.out.println("The selected fruit cannot be catched");
            }
        }
        System.out.println(sBasket);
        System.out.println("How many fruits would you like to eat? Enter 1-4");
        int intNumFruits = scFruits.nextInt();

        do {
            System.out.println("Enter which fruit you like to eat: A for Apple, O for Orange, M for Mango, and G for Guava");
            strSelectedFruit = scFruits.next();
            if (sBasket.peek().charAt(0) == strSelectedFruit.charAt(0)) {
                sBasket.pop();
                System.out.println(sBasket);
                intNumFruits--;
            } else {
                System.out.println("You cannot eat the selected fruit or you reached the limit");
            }
        } while (sBasket.size() > 0 && intNumFruits > 0);
        System.out.println("Basket is empty or you reached the limit");

    }
}
