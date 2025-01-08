package Arrays;

import java.util.Scanner;

public class FindDoubletWhoseSumIsEqual {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,4,5,6,7};
        int x = 7;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr.length){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i]+" "+arr[j]);
                }
                j++;
            }
            i++;
        }
    }
}
