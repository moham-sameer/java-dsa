package topInterview.Array_String;
import java.util.Arrays;
public class candy {

  public static void main(String[] args) {
    int ratings [] = {1,0,2};
     int n = ratings.length;
    int candies[] = new int[n];
    Arrays.fill(candies,1);
    for(int i = 1; i<n;i++){
      if(ratings[i]>ratings[i-1]) candies[i] = candies[i-1]+1;
    }
    for(int j = n-2;j>=0;j--){
      if(ratings[j]>ratings[j+1]){  candies[j] = Math.max(candies[j],candies[j+1]+1);}
    }
    int totalCandies = 0;
    for(int i = 0;i<n;i++){
      totalCandies += candies[i];
    }
    System.out.println(totalCandies);
  }
}
