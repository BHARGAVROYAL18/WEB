package Patterns;

import java.util.Scanner;

/*
 * * * * *
 *       *
 * * * * *
 */
public class Hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length =sc.nextInt();
        int height=sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <length; j++) {
                if( i==0 || i == height -1 || j==0 || j==length-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
