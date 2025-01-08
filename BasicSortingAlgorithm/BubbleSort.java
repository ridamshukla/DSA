package BasicSortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,3,4,2,1,0,6};

        int i = 0;
        while(i < arr.length-1){
            int j = 0; int swap = 0;
            while(j < arr.length-1-i){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                j++;
            }
            if(swap == 0){
                break;
            }
            i++;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
