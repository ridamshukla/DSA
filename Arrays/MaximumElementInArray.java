package Arrays;

import java.util.Scanner;

public class MaximumElementInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {5,4,3,16,8,11,13};
        int Max = 0;

        int i = 0;
        while(i < arr.length){
            if(arr[i] > Max){
                Max = arr[i];
            }
            i++;
        }
        System.out.println(Max);
    }
}
