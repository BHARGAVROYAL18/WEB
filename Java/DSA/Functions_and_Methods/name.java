package Functions_and_Methods;

import java.util.Scanner;

public class name {
    public static void printName( String name ){
        System.out.println("Your Name is " + name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        printName(name);
        sc.close();
    }
}
