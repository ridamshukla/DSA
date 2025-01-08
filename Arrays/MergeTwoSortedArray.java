package Arrays;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,3,5,7};
        int[] brr = {2,4,6,8,10,12};
        int sum = arr.length + brr.length;
        int[] crr = new int[sum];

        int i = 0; int j = 0; int k = 0;
        while(i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            } else if(brr[j] < arr[i]){
                crr[k] = brr[j];
                k++;
                j++;
            } if(i == arr.length){
                int a = arr.length-1;
                while(a < brr.length){
                    crr[k] = brr[a];
                    a++;
                    k++;
                }
            } if(j == brr.length){
                int a = brr.length;
                while(a < arr.length){
                    crr[k] = arr[a];

                    a++;
                    k++;
                }
            }
        }
        for(int ele : crr){
            System.out.print(ele+" ");
        }
    }
}
