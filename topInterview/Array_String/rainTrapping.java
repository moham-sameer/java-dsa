package topInterview.Array_String;

public class rainTrapping {
    public static void main(String[] args) {
       int blocks[] = {0,1,0,2,1,0,1,3,2,1,2,1} ;
       System.out.println(trap(blocks));
    }
    public static int trap(int[] blocks){
        int n = blocks.length;
        int left = 0;
        int right = n-1;
        int leftbar = blocks[0];
        int rightbar = blocks[n-1];
        int ans = 0;
        while(left<=right){
            if(leftbar<rightbar){
                if(blocks[left]>leftbar){
                     leftbar = blocks[left];
                }else{
                    ans += leftbar - blocks[left] ;
                }
                left++;
            }
            else{
                if(blocks[right]>rightbar){
                    rightbar = blocks[right];
                }else{
                    ans += rightbar - blocks[right];
                }
                right--;
            }
        }
        return ans;

    }

}
