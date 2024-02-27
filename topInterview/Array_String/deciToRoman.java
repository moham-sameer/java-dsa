package topInterview.Array_String;

import java.util.Scanner;

public class deciToRoman {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         System.out.print("Integer to Roman: ");
         int num = inp.nextInt();
         System.out.println("The output is: "+ decimalToRoman(num) );

    }
    public static String decimalToRoman(int num){
      
       String [] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
       StringBuilder output = new StringBuilder();
       for(int i = 0; i<values.length;i++){
        while(num >= values[i]){
             output.append(romans[i]);
             num = num - values[i];
        }
       }

      
       return output.toString();

    }

}
