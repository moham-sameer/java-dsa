package topInterview.Array_String;

public class stockTwo {
    public static void main(String[] args) {
        int prices[] = {7,5,3,1};
        int maxProfit = MaxProfit(prices);
        System.out.println("The Max Profit is : "+ maxProfit);
    }
    public static int MaxProfit(int prices[]){
    //    int minValue = Integer.MAX_VALUE;
       int maxProfit = 0;
       for(int i = 1; i < prices.length;i++ ){
        if(prices[i-1]<prices[i]){
            maxProfit += prices[i] - prices[i-1];
        } 
       }
       return maxProfit;
    }

}


