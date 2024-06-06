package kunalDsa.Recursion;
public class Permutations {
     public static void main(String[] args) {
         perm("", "abc"); 
     } 
     public static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        for(int i = 0; i <= p. length(); i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            perm(s+c+e, up.substring(1));
            
        }
     }


}
