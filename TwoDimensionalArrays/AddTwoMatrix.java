package TwoDimensionalArrays;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] brr = {{2,3,4},{5,6,7},{8,9,10}};

        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                brr[i][j] = arr[i][j] + brr[i][j];
                j++;
            }
            i++;
        }

        for(int[] ele : brr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
