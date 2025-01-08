package Arrays;

public class SecondNonRepeating {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,7,5,2,1,4};

        int sum = 0;
        int i = 0;
        while(i < arr.length){
            int j = i+1; int count = 0; int count1 = 0;
            while(j < arr.length){
                if(arr[i] == arr[j]){
                    count++;
                    count1++;
                    int temp = arr[i+count];
                    arr[i+count] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            if(count1 == 0){
                sum++;
            }
            if(sum == 2){
                System.out.println(arr[i]);
                break;
            }
            count++;
            i += count;
        }
    }
}
