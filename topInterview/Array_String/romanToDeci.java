package topInterview.Array_String;

import java.util.*;
import java.util.Scanner;

public class romanToDeci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         System.out.print("Roman to Integer: ");
         String s = inp.nextLine();
         System.out.println("The output is: "+ romanToDecimal(s) );

    }
    public static int romanToDecimal(String s){
       HashMap<Character,Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int n = s.length();
       int output = 0;
       for(int i =0;i<n;i++){
        if(i<n-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
           output += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
           i++;
        } else{
           output += map.get(s.charAt(i));
        }
       }
       return output;

    }

}
