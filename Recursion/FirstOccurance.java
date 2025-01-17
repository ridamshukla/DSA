package Recursion;

public class FirstOccurance {
    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,5,1,2};
        int count = 0;
        int i = 0;
        occurance(arr,i,count);
    }
    public static void occurance(int[] arr,int i,int count){
        int key = 5;
        if(i == arr.length-1){
            return;
        }
        if(key == arr[i]){
            if(count == 0){
                count = i;
                System.out.println(count);
            }
        }
        occurance(arr,i+1,count);
    }
}
