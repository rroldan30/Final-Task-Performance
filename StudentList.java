package com.mycompany.studentlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class StudentList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> sList = new HashMap<>();
        
        for(int i = 0; i < 3; i++){
            System.out.print("Enter Student Number: ");
            int studentNumber = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter First Name: ");
            String fName = sc.nextLine().toUpperCase();
            sList.put(studentNumber, fName);
        }
        
        System.out.println("Student List: ");
        for(Map.Entry<Integer, String> entry: sList.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        if(sList.size() >= 3){
            int thirdEntryKey = (int) sList.keySet().toArray()[2];
            sList.remove(thirdEntryKey);
        }
        
        System.out.print("Enter your Student Number: ");
        int studentNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your First Name: ");
        String firstName = sc.nextLine().toUpperCase();
        sList.put(studentNumber, firstName);
        
        System.out.println("Student List: ");
        Set<Integer> keys = sList.keySet();
        for(Map.Entry<Integer, String> entry : sList.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}