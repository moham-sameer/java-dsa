package topInterview.Array_String;

import java.util.Scanner;

public class lastWord {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String s = inp.nextLine();
         System.out.println(lastWordLength(s));
    }
    public static int lastWordLength(String s){
        String[] word = s.split(" ");

        for(int i = word.length - 1;i>=0;i--){
            if(!word[i].isEmpty()){
                return word[i].length();
            }
        }
        return 0;
    }

}
