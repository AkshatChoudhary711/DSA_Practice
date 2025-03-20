package org.practice.hash_sets;

import java.util.HashSet;

public class demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2); //adds an element to the set
        set.add(3); //adds an element to the set
        set.add(4); //adds an element to the set
        set.add(5); //adds an element to the set
        set.add(6); //adds an element to the set
        set.isEmpty(); //checks if the set is empty
        set.clear(); //clears the set
        set.contains(2);//checks if the set contains the element
        set.toArray(); //converts the set to an array
        set.size(); //returns the size of the set
        set.remove(2); //removes the element from the set
        set.equals(set); //checks if the set is equal to the set

    }
}
