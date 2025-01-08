package Arrays;

import java.util.Scanner;

public class SumElementInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println("Sum Of All Elements In Array Is: "+sum);
    }
}
