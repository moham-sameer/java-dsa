package sharpener;

public class bitman{
    public static void main(String[] args) {
        int n = 9;
        int count = 0;
        // ! this another way of counting set bits(which is 1).
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        // ! this is one way of counting bits 
        // while(n > 1){
        //     count += n&1;
        //     n >>=1;
        // }
        // if(n==1){
        //     count++;
        // }
         System.out.println(count);
    }
}