package Arrays;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {2,3,2,4,5,2,1,3,4,3};
        int i = 0;
        while(i < arr.length){
            int digit = 0;
            int count = 1;
            int j = i+1;
            while(j < arr.length){
                if(arr[i] == arr[j]){
                    count++;
                    digit = arr[i];
                }
                j++;
            }
            System.out.println("digit "+digit+" occurance "+count+" time");
            i++;
        }
    }
}
