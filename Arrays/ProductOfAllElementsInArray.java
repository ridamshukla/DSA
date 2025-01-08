package Arrays;

import java.util.Scanner;

public class ProductOfAllElementsInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Size Of Array: ");
        int Size = input.nextInt();
        int[] arr = new int[Size];
        int Product = 1;

        int i = 0;
        while(i < Size){
            System.out.print("Enter The "+(i+1)+" Element Of Array: ");
            arr[i] = input.nextInt();
            i++;
        }

        int a = 0;
        while(a < Size){
            Product *= arr[a];
            a++;
        }

        System.out.println("Product Of All Element In Array: "+Product);
    }
}
