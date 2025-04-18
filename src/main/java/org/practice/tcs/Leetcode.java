package org.practice.tcs;

import java.util.HashSet;

public class Leetcode {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,6,4,5};
        int b[] = {2,3,2,4,6,2,3,1,2};
        System.out.println(intersect(a,b));
    }

    public static int intersect(int a[], int b[]){
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int num:a){
            set1.add(num);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int num:b){
            set2.add(num);
        }

        set1.retainAll(set2);
        System.out.println(set1);
        return set1.size();




    }
}
