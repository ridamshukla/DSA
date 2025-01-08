package TwoDimensionalArrays;

public class MultiplicationOfTwoMatrices {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] brr = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] crr = new int[arr.length][arr[0].length];

        int a = 0;
        while (a < arr.length) {
            int i = 0;
            int k = a;
            int l = 0;
            while (i < arr.length) {
                int j = 0;
                int sum = 0;
                while (j < arr[0].length) {
                    sum += arr[k][j] * brr[j][l];
                    j++;
                }
                crr[k][l] = sum;
                l++;
                i++;
            }
            a++;
        }
        for(int[] ele : crr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
