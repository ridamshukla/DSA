package Arrays;

import java.util.Scanner;

public class NextGreatestElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,8,5,6,9,4,7,2,3};
        int[] brr = new int[arr.length];

        int i = 0; int k = 0;
        while(i < arr.length){
            int count = 0;
            int j = i+1;
            while(j < arr.length){
                if(arr[j] > count){
                    count = arr[j];
                }
                j++;
            }
            brr[k] = count;
            if(k == brr.length-1){
                brr[k] = -1;
            }
            i++;
            k++;
        }

        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}
