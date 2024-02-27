package topInterview.Array_String;

import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String s = inp.nextLine();
         System.out.println(reversw(s));
      

    }
    public static String reversw(String s){
        String[] words = s.trim().split("\\s+");
        int left = 0;
        int right = words.length - 1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", words);
    }  

}
