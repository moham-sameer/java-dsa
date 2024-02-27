package topInterview.Array_String;

// import java.util.*;

public class stock {
    public static void main(String[] args) {
        int prices[] = {4,1,3,5,7};
        int result = buySell(prices);
        System.out.println(result);
        
    }
    public static int buySell(int prices[]){
        int min = prices[0];
        int max = 0;
        int profit = 0;
        for(int stockprices: prices){
          min = Math.min(min,stockprices);
          profit = stockprices - min;
          max = Math.max(max,profit);
        }

        return max;

    }
}
