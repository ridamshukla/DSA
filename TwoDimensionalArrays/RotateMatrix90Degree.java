package TwoDimensionalArrays;

import java.util.Scanner;

public class RotateMatrix90Degree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};


        int i = 0;
        while(i < arr[0].length){
            int j = 0;
            while(j <= i) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                j++;
            }
            i++;
        }

        int a = 0;
        while(a < arr.length){
                int c = 0; int d = arr[0].length-1;
                while(c <= d){
                    int temp1 = arr[a][c];
                    arr[a][c] = arr[a][d];
                    arr[a][d] = temp1;
                    c++;
                    d--;
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
