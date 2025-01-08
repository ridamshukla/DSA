package Arrays;

import java.util.Scanner;

public class DiffereceSumOfEvenAndOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,5,6,8,9};
        int diff = 0;
        int SumOfEven = 0;
        int SumOfOdd = 0;

        int i = 0;
        while(i < arr.length){
            if(i % 2 == 0){
                SumOfEven += arr[i];
            } else{
                SumOfOdd += arr[i];
            }
            i++;
        }

        diff = SumOfEven - SumOfOdd;
        System.out.println("Difference Is : "+diff);
    }

}
