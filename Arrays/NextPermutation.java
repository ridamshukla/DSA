package Arrays;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {2,3,1,2,3,4};

        int pivot = -1;
        int i = arr.length-2;
        while(i >= 0){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
            i--;
        }

        int idx = 0;
        int j = arr.length-1;
        while(j >= 0){
            if(arr[j] > arr[pivot]){
                idx = j;
                break;
            }
            j++;
        }
        int temp = arr[pivot];
        arr[pivot] = arr[idx];
        arr[idx] = temp;

        int a = pivot+1; int b = arr.length-1;
        while(a <= b){
            int temp1 = arr[a];
            arr[a] = arr[b];
            arr[b] = temp1;
            a++;
            b--;
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
