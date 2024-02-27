package topInterview.Array_String;

import java.util.Arrays;

public class hIndex {
    public static void main(String[] args) {
        int citation [] = {3,0,6,1,5,7,8,9,10,11,12,13};
        int result =  hindex(citation);
         System.out.println(result); 
         System.out.println(Arrays.toString(citation));  
        }
        public static int hindex(int citation[]){
            Arrays.sort(citation);
            int n = citation.length;
            int h = 0;

            for(int i = 0; i<n ; i++){
                int atleastH = n - i;
                if(citation[i] >= atleastH){
                    h = atleastH;
                    break;
                }
            }
        return h;
    }
}
