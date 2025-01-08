package Arrays;

import java.util.Scanner;

public class ChangeOddMulBy2AndEvenPlus10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[]  arr = {1,2,3,4,5};

        int i = 0;
        while(i < arr.length){
            if(i % 2 != 0){
                arr[i] += 10;
            } else{
                arr[i] *= 2;
            }
            i++;
        }

        for(int ele : arr)
            System.out.print(ele+" ");
    }
}
