package Arrays;

import java.util.Scanner;

public class ArrayIsPalindromeOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,2,1};
        boolean check = true;

        int i=0; int j=arr.length-1;
        while(i <= j){
            if(arr[i] != arr[j]){
                check = false;
            }
            i++;
            j--;
        }

        if(check == true){
            System.out.println("array is palindrome: ");
        } else{
            System.out.println("array is not palindrome: ");
        }
    }
}
