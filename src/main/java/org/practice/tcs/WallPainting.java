package org.practice.tcs;

import java.util.Scanner;

public class WallPainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interiorWalls = sc.nextInt();
        int exteriorWalls = sc.nextInt();
        float totalCost = 0f;
        if(interiorWalls<0 || exteriorWalls <0){
            System.out.println("INVALID_INPUT");
            System.exit(0);
        }else if(interiorWalls == 0 && exteriorWalls ==0){
            System.out.printf("Total Estimated Cost: %.1f INR",totalCost);
            System.exit(0);
        }
        for(int i=1; i<=interiorWalls; i++){
            totalCost+=(sc.nextFloat() * 18.0f);
        }
        for(int i=1; i<=exteriorWalls; i++){
            totalCost+=(sc.nextFloat() * 12.0f);
        }
        System.out.printf("Total Estimated Cost: %.1f INR",totalCost);
    }
}
