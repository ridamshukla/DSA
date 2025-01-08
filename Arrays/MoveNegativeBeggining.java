package Arrays;

import java.util.Scanner;

public class MoveNegativeBeggining {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,-1,3,-3,7,8,-4,6,9};

        int i = 0; int j = 1;
        while(i < arr.length && j < arr.length){
            if(arr[i] > 0 && arr[j] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if(arr[i] > 0 && arr[j] > 0){
                j++;
            }

        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
