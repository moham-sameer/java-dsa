package kunalDsa.linearSearch;

public class searchInString {
    public static void main(String[] args) {
        String name = "Sameer";
        char target = 'z';
        System.out.println(search(name, target));
    }
    // ! this is the basic method using for loop
    // public static boolean search(String str,char target){
    //     if(str.length()==0){
    //         return false;
    //     }
    //     for(int i = 0;i<str.length();i++){
    //           if(str.charAt(i)==target){
    //              return true;
    //           }
    //     }
    //     return false;
    // }

    // ! This is for each loop method
     public static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
              if(ch ==target){
                 return true;
              }
        }
        return false;
    }
}
