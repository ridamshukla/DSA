package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};

        // First Method By Using Extra Array
        int[] brr = new int[arr.length];

        int i = 0; int a = arr.length-1;
        while(i < arr.length){
            brr[i] = arr[a];
            i++;
            a--;
        }
        for(int ele: brr){
            System.out.print(ele+" ");
        }

        // By Using Two Pointer

        int b = 0; int c = arr.length-1;
        while(b <= c){
            int temp = arr[b];
            arr[b] = arr[c];
            arr[c] = temp;
            b++;
            c--;
        }

        System.out.println();

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
