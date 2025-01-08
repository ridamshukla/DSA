package Arrays;

import java.util.Scanner;

public class NonRepeatingElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {3,1,1,3,4,6,3,5,4,5};

        int i = 0;
        while(i < arr.length){
            int j = i+1; int count = 0; int count1 = 0;
            while(j < arr.length){
                if(arr[i] == arr[j]){
                    count1++;
                    count++;
                    int temp = arr[i+count];
                    arr[i+count] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            if(count1 == 0){
                System.out.println(arr[i]);
                break;
            }
            count++;
            i += count;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
