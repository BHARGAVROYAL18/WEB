package Basic;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a ");
        a = sc.nextInt();
        System.out.println("Enter a value for b ");
        b = sc.nextInt();
        System.out.println("Sum is "+(a+b));
        sc.close();
    }
}
