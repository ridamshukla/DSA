package Arrays;

import java.util.Scanner;

class A{
    A(int[] arr){
        arr[0] = 90;
    }

}
public class PaasingArrayToFunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        A p = new A(arr);
        System.out.println(arr[0]);
    }
}
