package Arrays;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        boolean check = true;
        int i = 0;
        while(i < arr.length-1){
            if(arr[i] > arr[i+1]){
                check = false;
            }
            i++;
        }
        if(check == true){
            System.out.println("Array IS Sorted: ");
        } else{
            System.out.println("Array Is Not Sorted: ");
        }
    }
}
