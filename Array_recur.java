/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array_recur;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author RZ Roldan
 */
public class Array_recur {

    public static void main(String[] args) {
       
        Integer arr[] = { 10, 25, 35, 45, 55 };
  
        ArrayList <Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
        
        Iterator <Integer> listElement = null;
        
        arrList.add(65);
 
        listElement = arrList.listIterator();
    
        recur(listElement);
        
    }
       static void recur (Iterator <Integer> listElement){
            
            while (listElement.hasNext()){
                System.out.println(listElement.next());
                
        }
     }
 }




