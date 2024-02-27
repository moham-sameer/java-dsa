package kunalDsa.linearSearch;

public class maxWealth {
       public static void main(String[] args) {
           int[][] accounts = {
            {7,4,3},
            {2,4,3},
            {7,8,3},
           } ;
          int ans = maxW(accounts);
          System.out.println(ans);
       }
       public static int maxW(int[][] accounts){
         int max = Integer.MIN_VALUE;
         for(int person = 0; person<accounts.length;person++){
             int sum = 0;
             for(int account = 0; account<accounts[person].length;account++){
                   sum += accounts[person][account];
             }
             if(sum>max){
              max = sum;
             }
         }
         return max;
       }
}
