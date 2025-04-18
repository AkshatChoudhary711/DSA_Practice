package org.practice.Patterns;


/*

@ -> start
[ ] -> space

   1  2  3  4  5  6  7  8  9            row     space      values   (star, space)
1 [ ][ ][ ][ ] @                         1        4         1       (  1 ,  0   )
2 [ ][ ][ ] @ [ ] @                      2        3         3       (  2 ,  1   )
3 [ ][ ] @ [ ] @ [ ] @                   3        2         5       (  3 ,  2   )
4 [ ] @ [ ] @ [ ] @ [ ] @                4        1         7       (  4 ,  3   )
5  @ [ ] @ [ ] @ [ ] @ [ ] @             5        0         9       (  5 ,  4   )

 */

public class Triangle {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++ ){//rows
            for(int j=1; j<=n-i; j++){//spaces
                System.out.print(" ");
            }
            for(int k =1; k<=2*i-1; k++){//star and spaces
                if(k%2==0) { //even->space
                    System.out.print(" ");
                }else{//odd->star
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }
}
