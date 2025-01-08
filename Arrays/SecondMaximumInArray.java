package Arrays;

import java.util.Scanner;

public class SecondMaximumInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {5,2,12,3,7,12};
        int max = 0;
        int smax = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }
        int j = 0;
        while(j < arr.length){
            if(arr[j] > smax && arr[j] != max){
                smax = arr[j];
            }
            j++;
        }

        // second way in one loop

        int a = 0;
        while(a < arr.length){
            if(arr[a] > max){
                smax = max;
                max = arr[a];
            } else if(arr[a] > smax && arr[a] != max){
                smax = arr[a];
            }
            a++;
        }
        System.out.println("Maximum Element Is: "+max);
        System.out.println("Second Maximum Is: "+smax);
    }
}
