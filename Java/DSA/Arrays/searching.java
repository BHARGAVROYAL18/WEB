package Arrays;

import java.util.Scanner;

class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array");
        int size = sc.nextInt();
        
        int array[] = new int[size];
        System.out.println("Enter the Elements");
        for (int i = 0; i < array.length; i++) {
             array[i]= sc.nextInt();
        }
        System.out.println("Enter the Target Element");
        int target = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                System.out.println("Number is at "+ i + " index");
            }
        }
        sc.close();
    }
}