package Arrays;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int x = 3;

        // Check The Element Is Present In Array

        int i = 0;
        while(i < arr.length){
            if(arr[i] == x){
                System.out.println("Yes Element Is Present In Array: ");
                break;
            }
            i++;
        }
    }
}
