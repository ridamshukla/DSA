package BasicSortingAlgorithm;

public class CountSort {
    public static void main(String[] args){
        int[] arr = {1,4,1,3,2,7,7,6,4};

        int largest = Integer.MIN_VALUE;
        int i1 = 0;
        while(i1 < arr.length){
            if(arr[i1] > largest){
                largest = arr[i1];
            }
            i1++;
        }
        int[] brr = new int[largest+1];

        // mera tarika:
        int i = 0;
        while(i < arr.length){
            int store = arr[i];
            ++brr[store];
            i++;
        }

        int a = 0; int k = 0;
        while(a < brr.length){
            int b = 0;
            while(b < brr[a]){
                arr[k] = a;
                b++;
                k++;
            }
            a++;
        }

        // actual count sort:



        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
