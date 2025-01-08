package Arrays;

import java.util.Scanner;

public class CountElementInArrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int count = 0;
        int i = 0;
        while(i < arr.length){
            count++;
            i++;
        }
        System.out.println("Toatl element present in array is: "+count);
    }
}
