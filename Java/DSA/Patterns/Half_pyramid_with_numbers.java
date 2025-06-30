package Patterns;

import java.util.Scanner;

public class Half_pyramid_with_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows"); 
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
