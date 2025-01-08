package Arrays;

import java.util.Scanner;

public class PrintRollNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Array Literal

        int[] arr = {32,54,65,89,28,98};
        int i = 0;
        while(i < arr.length){
            if(arr[i]< 35){
                System.out.println("Student Got Less than 35 Marks Is: "+i);
            }
            i++;
        }
    }
}
