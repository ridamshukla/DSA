package TwoDimensionalArrays;

import java.util.Scanner;

public class DiffBWRowWisePrintingAndColoumn {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1,2},{3,4},{5,6}};

        // Row Wise Printing

        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }


        // Coloumn Wise Printing

        int a = 0;
        while(a < arr[0].length){
            int b = 0;
            while(b < arr.length){
                System.out.print(arr[b][a]+" ");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
