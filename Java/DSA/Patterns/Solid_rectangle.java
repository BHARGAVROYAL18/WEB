package Patterns;

import java.util.Scanner;

public class Solid_rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth of the recatngle");
        Scanner sc=new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
