package sharpener;
class swapwithoutextraVariable{
    public static void main(String[] args) {
        int a = 14;
        int b = 28;
         
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}