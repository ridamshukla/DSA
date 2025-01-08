package Arrays;

import java.util.Scanner;

public class SmallestPositiveMissingElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,3,5,7,5,4,0};
        int num = 0;
        int i = 0;
        while(i < arr.length){
            int count = 0;
            int j = 0;
            while(j < arr.length){
                if(arr[j] == num){
                    count++;
                }
                j++;
            }
            if(count == 0){
                System.out.println(num);
                break;
            }
            i++;
            num++;
        }
    }
}
