package Arrays;

import java.util.Scanner;

public class OneValueUnique {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,3,1,4,7,4,7,3,2,8,8};

        // first method
        int i = 0;
        while(i < arr.length){
            int count = 0;
            int j = i+1;
            while(j < arr.length){
                if(arr[i] == arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i+1];
                    arr[i+1] = temp;
                    count++;
                }
                j++;
            }
            if(count == 0){
                System.out.println(arr[i]);
                break;
            }
            i += 2;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
