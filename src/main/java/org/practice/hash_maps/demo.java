package org.practice.hash_maps;

import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Akshat", 1); //adds a key value pair to the map
        map.put("Rahul", 2);
        map.put("Rohan", 2);
        map.put("Rohit", 4);
        System.out.println(map);
        System.out.println(map.get("Rahul"));
        System.out.println(map.isEmpty());
//        map.clear(); //clears the map
        System.out.println(map.containsKey("Aks"));
        System.out.println(map.containsValue(23));
        map.entrySet(); //returns a set of key value pairs
        System.out.println(map.values());  //returns a collection of values
        System.out.println(map.keySet());  //returns a set of keys
        map.remove("Rohan",23); //removes the key value pair if the key value pair is present
        map.remove("Rohan"); //removes the key value pair if the key is present
        System.out.println(map);
        System.out.println(map.size()); //returns the size of the map
    }
}
