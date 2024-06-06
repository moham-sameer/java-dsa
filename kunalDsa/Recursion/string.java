package kunalDsa.Recursion;

public class string {
   public static void main(String[] args) {
      // skip("", "abbacacd");
   //   String arr = Skip("abbacacd");
   //   System.out.println(arr);
   System.out.println(skipApple("lkappjoapplelskdjfs"));
   } 
   public static String skipApple(String up){
      if(up.isEmpty()){
         return "";
      }
      if(up.startsWith("apple")){
        return skipApple(up.substring(5));
      }else{
         return up.charAt(0) + skipApple(up.substring(1));
      }
   }
   public static String Skip(String up){
      if(up.isEmpty()){
         return "";
      }
      char ch = up.charAt(0);
      if(ch == 'a'){
        return Skip(up.substring(1));
      }else{
         return ch +  Skip(up.substring(1));
      }
      
   }
   //! method to skip the given character in string.
   public static void skip(String p, String up){
      if(up.isEmpty()){
         System.out.println(p);
         return;
      }

      char ch = up.charAt(0);
      if(ch == 'a'){
         skip(p, up.substring(1));
      }else{
         skip(p+ch, up.substring(1));
      }

   }
}
