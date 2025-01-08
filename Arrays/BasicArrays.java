package Arrays;

import java.util.Scanner;

public class BasicArrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int Size = input.nextInt();

        // Creating A New Array
        int[] arr = new int[Size];

        // Taking Input Elements In Arrays

        int i = 0;
        while(i < Size){
            System.out.print("Enter the "+(i+1)+" element of array: ");
            arr[i] = input.nextInt();
            i++;
        }

        // Printing The Array

        int j = 0;
        while(j < Size){
            System.out.print(arr[j]+" ");
            j++;
        }

    }
}
