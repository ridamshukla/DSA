package Arrays;

public class KadaneAlgorithm {
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        int maxSum = 0;
        int CurrentSum = 0;
        int i = 0;
        while(i < arr.length){
            CurrentSum += arr[i];
            if(CurrentSum < 0){
                CurrentSum = 0;
            }
            if(CurrentSum > maxSum){
                maxSum = CurrentSum;
            }
            i++;
        }

        System.out.println(maxSum);
    }
}
