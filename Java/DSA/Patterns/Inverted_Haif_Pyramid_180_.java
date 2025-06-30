package Patterns;

import java.util.Scanner;

public class Inverted_Haif_Pyramid_180_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int spaces = rows - i - 1; spaces > 0; spaces--) {
                System.out.print("  ");
            }
            for (int stars=i+1; stars > 0; stars--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
