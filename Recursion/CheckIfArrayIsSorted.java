package Recursion;

public class CheckIfArrayIsSorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,6,5};
        int i = 0;
        check(arr,i);
    }
    public static void check(int[] arr,int i){
        if(i == arr.length-1){
            return;
        }
        if(arr[i] > arr[i+1]){
            System.out.println("Array is not sorted: ");
        }
        check(arr,i+1);
    }
}
