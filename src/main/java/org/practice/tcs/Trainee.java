package org.practice.tcs;

import java.util.Scanner;

public class Trainee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg[] = new int[3];
        int t1 =0, t2 =0, t3=0;
        for(int i=1; i<=3; i++){
            int a =sc.nextInt();
            if (a>=1 && a<=100) t1+=a;
            int b =sc.nextInt();
            if (b>=1 && b<=100) t2+=b;
            int c =sc.nextInt();
            if (c>=1 && c<=100) t3+=c;

        }
        sc.close();
        avg[0] = t1/3;
        avg[1] = t2/3;
        avg[2] = t3/3;

        int max = 0;
        if(avg[0]<70 && avg[1]<70 && avg[2]<70){
            System.out.println("All Trainees are unfit");
            System.exit(0);
        }
        for (int i=0; i<3; i++){
            if(avg[i]>max) max = avg[i];

        }

        for (int i = 0; i < 3; i++) {
            if(avg[i] == max) System.out.println("Trainee Number: "+(i+1));

        }





    }
}
