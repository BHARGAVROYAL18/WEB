package Patterns;

import java.util.Scanner;

public class inverted_half_pyramid_with_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =  sc.nextInt();
        for ( int i = rows ; i>=0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }


        sc.close();

    }
}
