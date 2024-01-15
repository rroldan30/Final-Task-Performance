package com.mycompany.activityhashmap;

import java.util.HashMap;
import java.util.Map;

public class ActivityHashMap {

    public static void main(String[] args) {
        Map<String, String> programs = new HashMap<>();
        programs.put("BSIT", " - Bachelor of Science in Information Technology");
        programs.put("BSCS", " - Bachelor of Science in Computer Science");
        programs.put("BSIS", " - Bachelor of Science in Information Systems");
       
        System.out.print("Keys: ");
        for (String key : programs.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        
        String deletedProgram = programs.remove("BSIT");
        System.out.println("Deleted Entry: " + deletedProgram);

        String keyToCheck = "BSCpE";
        boolean containsKey = programs.containsKey(keyToCheck);
        System.out.println("Does the map contain key '" + keyToCheck + "': " + containsKey);
    }
}