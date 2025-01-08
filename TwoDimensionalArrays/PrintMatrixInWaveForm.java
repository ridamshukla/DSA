package TwoDimensionalArrays;

import java.util.Scanner;

public class PrintMatrixInWaveForm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int i = 0;
        while(i < arr.length){
            if(i % 2 != 0){
                int a = 0; int b = arr[0].length-1;
                while(a <= b){
                    int temp = arr[i][a];
                    arr[i][a] = arr[i][b];
                    arr[i][b] = temp;
                    a++;
                    b--;
                }
            }
            i++;
        }

        for(int[] ele: arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
