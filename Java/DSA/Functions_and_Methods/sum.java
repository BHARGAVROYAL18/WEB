package Functions_and_Methods;

import java.util.Scanner;

public class sum {
    public static int add(int a ,int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = sc.nextInt();
        System.out.println("Enter the value of B");
        int B = sc.nextInt();
        System.out.println("Sum of A and B is " +add(A,B));
        sc.close();
    }
}
