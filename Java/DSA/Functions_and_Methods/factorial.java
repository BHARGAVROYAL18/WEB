package Functions_and_Methods;

import java.util.Scanner;

public class factorial {
    public static int facto(int A) {
        int fact = 1 ;
        for (int i = 2; i <= A; i++) {
            fact = fact * i ;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = sc.nextInt();
        
        System.out.println("Factorial of A is " + facto(A));
        sc.close();
        
    }
}
