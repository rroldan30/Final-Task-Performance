/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myarrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author RZ Roldan
 */
public class MyArrays {

   public static void main(String[] args) {
       
       //array list
        Integer arr[] = { 10, 25, 35, 45, 55 };
        
        //int arrLen = arr.length;
        
        ArrayList <Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
       
        //adding new element
        arrList.add(65);
       
        Iterator itr = arrList.iterator(); 
        
        //SOP
        //System.out.println("Lenght of array is " + arrLen);
        //System.out.println("Elements of given array: ");
        System.out.println(itr);
       
        //loop to display elements
        //for (int i = 0; i < arrList.size() ; i++) {
        
        //System.out.println(arrList.get(i));
        
        //}
    }
}
