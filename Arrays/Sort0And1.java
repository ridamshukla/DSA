package Arrays;

import java.util.Scanner;

public class Sort0And1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,1,1,0,1,0,1,1,0,0,1};

        // First Method By Using Extra Loop

//        int i = 0;
//        while(i < arr.length){
//            int j = i+1;
//            while(j < arr.length){
//                if(arr[i] == 0 && arr[j] == 1 || arr[i] == 1 && arr[j] == 0){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    break;
//                }
//                j++;
//            }
//            i++;
//        }

        int a = 0; int b = 1;
        while(a < arr.length && b < arr.length){
            if(arr[a] == 1 && arr[b] == 0){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b++;
            } else if(arr[a] == 1 && arr[b] == 1){
                b++;
            }

        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
