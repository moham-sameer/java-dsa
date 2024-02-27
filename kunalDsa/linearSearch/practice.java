package kunalDsa.linearSearch;

class practice{
    public static void main(String[] args) {
       int[][] arr = {
        {10,12,3},
        {12,5,9},
        {9,9,12}
       };
       int ans = wealth(arr);
       System.out.println(ans);
    }
    public static int wealth(int[][]accounts){
        int max = Integer.MIN_VALUE;
        for(int person = 0;person<accounts.length;person++){
            int ans = 0;
            for(int account = 0;account<accounts[person].length;account++){
              ans +=  accounts[person][account];
            }
            if(max<ans){
               max = ans;
            }
        }
        return max;
    }
}