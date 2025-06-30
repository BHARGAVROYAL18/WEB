package Patterns;

import java.util.Scanner;

public class solid_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = rows-i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
