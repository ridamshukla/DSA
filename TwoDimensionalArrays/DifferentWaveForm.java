package TwoDimensionalArrays;

import java.util.Scanner;

public class DifferentWaveForm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int i = 0;
        while(i < arr[0].length){
            int j = 0;
            while(j <= i){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                j++;
            }
            i++;
        }

        int a = 0; int c = arr.length-1;
        while(a < arr.length){
            int b = 0;
            while(b < arr[0].length){
                if(b % 2 != 0 && a <= c){
                    int temp1 = arr[a][b];
                    arr[a][b] = arr[c][b];
                    arr[c][b] = temp1;
                }
                b++;
            }
            a++;
           c--;
        }

        for(int[] ele: arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
