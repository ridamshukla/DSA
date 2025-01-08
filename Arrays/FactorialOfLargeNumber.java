package Arrays;

import java.util.Scanner;

public class FactorialOfLargeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,3,2,5,6,4};
        int[] brr = new int[arr.length];

        // first method
        int i = 0;
        while(i < arr.length){
            int j = i+1;
            while(j < arr.length){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }

        int a = 0;
        while(a < arr.length){
            int b = a+1; int fact = arr[a];
            while(b < arr.length){
                fact *= arr[b];
                b++;
            }
            brr[a] = fact;
            a++;
        }
        for(int ele : brr){
            System.out.print(ele+" ");
        }

    }
}
