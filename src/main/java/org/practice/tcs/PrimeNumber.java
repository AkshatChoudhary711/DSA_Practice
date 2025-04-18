package org.practice.tcs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = getPrime(X);
        int B = getPrime(Y);
        int C = (A*B)-1;
        System.out.println(C);
    }
    static int getPrime(int n){
        int count = 1,num = 2;
        while(count!=n){
            num++;
            if(checkPrime(num)) count++;
        }
        return num;
    }

    static boolean checkPrime(int n){
        if (n==1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }


}
