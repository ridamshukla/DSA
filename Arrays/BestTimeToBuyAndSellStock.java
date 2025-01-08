package Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};

        int i = 1; int min = Integer.MAX_VALUE; int profit = Integer.MIN_VALUE;
        while(i < arr.length){
            int j = 0;
            while(j < i){
                if(arr[j] < min){
                    min = arr[j];
                }
                j++;
            }
            int profit1 = 0;
            profit1 = arr[i] - min;
            if(profit1 > profit){
                profit = profit1;
            }
            i++;
        }

        System.out.println(profit);

        // Second Way

        int Max = Integer.MAX_VALUE;
        int Profit = 0;

        int a = 0;
        while(a < arr.length){
            if(Max < arr[a]){
                int profits = arr[a] - Max;
                Profit = Math.max(Profit,profits);
            } else{
                Max = arr[a];
            }
            a++;
        }

        System.out.println(Profit);
    }
}
