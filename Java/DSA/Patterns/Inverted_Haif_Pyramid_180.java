package Patterns;

import java.util.Scanner;

public class Inverted_Haif_Pyramid_180 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int rows=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int spaces = i; spaces >0; spaces--) {
                System.out.print("  ");
            }
            for (int stars = rows - i; stars>0; stars--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}

