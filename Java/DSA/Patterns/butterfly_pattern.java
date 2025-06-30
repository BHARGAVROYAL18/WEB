package Patterns;

import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int rows =  sc.nextInt();
        
        int spaces = (rows * 2) - 2 ;
        
        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            for ( int k=spaces ; k  > 0 ; k--) {
                System.out.print("  ");
            }
            for (int l = i; l > 0; l--) {
                System.out.print("* ");
            }
            System.out.println("");
            spaces = spaces - 2 ;
        }
        int rows2=rows;
        int rows3=rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows2; j >0; j--) {
                System.out.print("* ");
            }
            for (int j = (i-1)*2; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = rows3; j >0; j--) {
                System.out.print("* ");
            }

            System.out.println("");
            rows2--;
            rows3--;
        }


        sc.close();
    }
}
