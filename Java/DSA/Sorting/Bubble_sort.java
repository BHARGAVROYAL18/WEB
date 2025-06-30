package Sorting;

public class Bubble_sort {

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }





    public static void main(String[] args) {
        int arr[]={4,3,6,33,5,3,533,5,3,553,345};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
