package TwoDimensionalArrays;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] brr = new int[2][3];


        int a = 0;
        while(a < arr[0].length){
            int b = 0;
            while(b < a){
                int temp = arr[a][b];
                arr[a][b] = arr[b][a];
                arr[b][a] = temp;
                b++;
            }
            a++;
        }

        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
