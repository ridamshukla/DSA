package Arrays;

import java.util.Scanner;

public class TripletWhoseSumIsEqual {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,4,5,6,7,8};

        int x = 7;
        int i = 0;
        while(i < arr.length){
            int j = i+1;
            while(j < arr.length-1){
                if(arr[i] + arr[j] + arr[j+1] == x){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[j+1]);
                }
                j++;
            }
            i++;
        }
    }
}
