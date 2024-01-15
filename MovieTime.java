/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.movietime;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author RZ Roldan
 */
public class MovieTime {

   public static void main(String[] args) {
        String movie1, movie2, movie3, snack1, snack2, snack3;
        Queue <String> movies = new LinkedList<>();
        Queue <String> snacks = new LinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie 1 of 3: ");
        movie1 = sc.nextLine();
        movies.offer (movie1);
        
        System.out.print("Enter movie 2 of 3: ");
        movie2 = sc.nextLine();
        movies.offer (movie2);
        
        System.out.print("Enter movie 3 of 3: ");
        movie3 = sc.nextLine();
        movies.offer (movie3);
        
        System.out.print("Enter snack 1 of 3: ");
        snack1 = sc.nextLine();
        snacks.offer (snack1);
        
        System.out.print("Enter snack 2 of 3: ");
        snack2 = sc.nextLine();
        snacks.offer (snack2);
        
        System.out.print("Enter snack 3 of 3: ");
        snack3 = sc.nextLine();
        snacks.offer (snack3);
        
        System.out.println("Movies to watch are:" + movies);
        System.out.println("Snacks available are:" + snacks);
        
        System.out.println("Press 'S' each time you finish a snack");
        
        while (!snacks.isEmpty()) {
            String key = sc.nextLine();
            if (key.equalsIgnoreCase("S")) {
                snacks.remove();
                System.out.println(snacks);
            }
        }

        if (snacks.isEmpty()) {
            System.out.println("No more snacks");
        
        
        }
    }
}