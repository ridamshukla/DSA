package Arrays;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,2,3,4,4,5,6,6};
        int[] brr = new int[arr.length];


         int k = 0; int i1 = 0; int j = 2;
        while(k < arr.length){
            if(arr[i1] == arr[i1+1] && arr[i1] != arr[j]){
                arr[i1+1] = arr[j];
            } else if(arr[i1] == arr[j]){
                j++;
                arr[i1+1] = arr[j];
                i1 = j;
                j++;
            }
            if(j == arr.length-1){

            }
            i1++;
            j++;
            k++;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
