
package Patterns;

import java.util.Scanner;

public class floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =  sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("");
        }


        sc.close();

    }
}
