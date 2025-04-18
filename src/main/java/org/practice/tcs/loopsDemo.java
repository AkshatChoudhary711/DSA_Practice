package org.practice.tcs;

public class loopsDemo {
    public static void main(String[] args) {

        int n = 5;
        int count =0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n;j++){
                for(int k=1; k<=n; k++ ){
                    count++;
                }
            }
        }

        //O(3*2*1) O(n*n*n) O(n^3)
        System.out.print(count);
    }
}
