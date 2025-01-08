package TwoDimensionalArrays;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;
        int k = arr.length-1;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr.length){
                if(i == j){
                    sum += arr[i][j];
                } else if(j == k){
                    sum += arr[i][k];
                }
                j++;
            }
            i++;
            k--;
        }
        System.out.println(sum);


        // optimised code
        int sum1 = 0;
        int a = 0;
        while(a < arr.length){
            sum1 += arr[a][a];
            if(a != arr.length-1-a)
            sum1 += arr[a][arr.length-a-1];
            a++;
        }

        System.out.println(sum1);
    }

}
