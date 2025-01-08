package Arrays;

public class MaximumSubarraySumBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};

        int maxSum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = i;
            while (j < arr.length) {
                int a = i;
                int sum = 0;
                while (a <= j) {
                    sum += arr[a];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }

                    j++;
                }
                i++;
            }

            System.out.println(maxSum);
        }
    }
}
