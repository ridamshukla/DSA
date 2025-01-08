package BasicSortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1,0,6};

        int i = 0;
        while(i < arr.length){
            int j = i; int min = Integer.MAX_VALUE;
            while(j < arr.length){
                if(arr[j] < arr[min]){
                    min = arr[j];
                    min = j;

                }
                j++;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            i++;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
