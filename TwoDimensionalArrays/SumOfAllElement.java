package TwoDimensionalArrays;

import java.util.Scanner;

public class SumOfAllElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }

        System.out.println("Sum Of All Element Is: "+sum);
    }
}
