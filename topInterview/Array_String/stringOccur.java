package topInterview.Array_String;

public class stringOccur {
    public static void main(String[] args) {
        String haystack = "sasad";
        String needle = "sad";
        System.out.println(Strs(haystack, needle));
    }
    public static int Strs(String haystack, String needle){
        if(needle.isEmpty()){
            return 0;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i , i + needle.length()).equals(needle)){
                return i;
             }
        }
        return -1;
    }
}
