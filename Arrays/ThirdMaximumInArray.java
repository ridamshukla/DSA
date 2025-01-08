package Arrays;

import java.util.Scanner;

public class ThirdMaximumInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {7,8,4,5,2,1,9,0};
        int max = 0;
        int smax = 0;
        int tmax = 0;

        int i = 0;
        while(i < arr.length){
            if(arr[i] > max){
                tmax = smax;
                smax = max;
                max = arr[i];
            } else if(arr[i] > smax && arr[i] != max){
                tmax = smax;
                smax = arr[i];
            } else if(arr[i] > tmax && arr[i] != max && arr[i] != smax){
                tmax = arr[i];
            }
            i++;
        }
        System.out.println("first maximum is: "+max);
        System.out.println("second maximum is: "+smax);
        System.out.println("third maximum is: "+tmax);
    }
}
