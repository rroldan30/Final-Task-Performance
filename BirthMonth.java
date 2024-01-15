
package com.mycompany.birthmonth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class BirthMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();

        for(int i = 0; i < 6; i++){
            System.out.print("Enter Birth Month: ");
            String birthMonth = sc.next().toUpperCase();
            
            if(i < 3){
                group1.add(birthMonth);
            }
            else{
                group2.add(birthMonth);
            }
        }
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);
        
        System.out.print("Enter your birth month: ");
        String selfBirthMonth = sc.next().toUpperCase();
        self.add(selfBirthMonth);
        
        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("Union: " + union);
        
        Set<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println("Intersection: " + intersection);
        
        Set<String> difference = new HashSet<>(group1);
        difference.removeAll(group2);
        System.out.println("Difference: " + difference);
        
        if(group1.contains(selfBirthMonth)||group2.contains(selfBirthMonth)){
            System.out.println("You have the same birth month with any your classmates.");
        }
        else{
            System.out.println("You doesn't have a same birth month with your classmates.");
        }
    }
}