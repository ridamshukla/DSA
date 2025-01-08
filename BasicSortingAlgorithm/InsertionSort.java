package BasicSortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1,0,6};

        int i = 0;
        while(i < arr.length-1){
            int a = i+1;
            while(a > 0){
                if(arr[a] < arr[a-1]){
                    int temp = arr[a];
                    arr[a] = arr[a-1];
                    arr[a-1] = temp;
                }
                a--;
            }
            i++;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
