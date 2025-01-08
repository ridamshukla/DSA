package TwoDimensionalArrays;

import java.util.Scanner;

public class FinfTheLargestElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int max = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
                j++;
            }
            i++;
        }

        System.out.println("Maximum element is: "+max);
    }
}
