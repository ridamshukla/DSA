package Arrays;

import java.util.Scanner;

public class RotateArrayByKStep {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] brr = new int[arr.length];

        // First Method By Using Another Array:
        int a = arr.length-2;
        int b = 0;
        int i = 0;
        while(i < arr.length){
            if(i < 2){
                brr[i] = arr[a];
                a++;
            } else{
                brr[i] = arr[b];
                b++;
            }
            i++;
        }

        // Second Method By Swapping

        int i1 = arr.length-k;
        while(i1 < arr.length-1){
            int temp = arr[i1];
            arr[i1] = arr[i1+1];
            arr[i1+1] = temp;
            i1++;
        }
        int a1 = 0; int b1 = arr.length-k-1;
        while(a1 <= b1){
            int temp = arr[a1];
            arr[a1] = arr[b1];
            arr[b1] = temp;
            a1++;
            b1--;
        }

        int a2 = 0; int b2 = arr.length-1;
        while(a2 <= b2){
            int temp = arr[a2];
            arr[a2] = arr[b2];
            arr[b2] = temp;
            a2++;
            b2--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
