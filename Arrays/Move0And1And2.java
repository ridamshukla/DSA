package Arrays;

import java.util.Scanner;

public class Move0And1And2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {2,1,2,1,0,1,0,1,2,0,1,1,0,2};

        int i = 0; int j = 0; int k = arr.length-1;
        while(j != k){
            if(arr[i] == 2 && arr[k] == 2){
                k--;
            } else if(arr[i] == 2 && arr[k] == 0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
}
