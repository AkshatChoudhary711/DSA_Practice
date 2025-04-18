package org.practice.instaReels;

/*
Pattern is
1st : 1,2,3,4,5, ......, 100
2nd : 2,4,6,8,.........,100
3rd : 3,6,9,12,........,99
.
.
25th : 25,50,75,100
.
.
50th: 50, 100
.
.
75th: 75
.
.
98th : 98
99th : 99
100th: 100
 */


public class DoorProblem {
    public static void main(String[] args) {
        //false -> door is closed
        //true -> door is open



        boolean doors[] = new boolean[100];
        for(int i=0; i<100; i++){
            for(int j =i; j<100; j+=i+1){
                doors[j] = !doors[j];
            }
        }
        countOpenDoors(doors);
    }

    public static void countOpenDoors(boolean[] arr){
        int count = 0;
        for (boolean b : arr) {
            if (b) count++;
        }
        System.out.println(count);
    }
}
