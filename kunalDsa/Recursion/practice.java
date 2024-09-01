package kunalDsa.Recursion;
import java.util.*;
class practice{
  public static void main(String[] args) {
    String[] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
   int maxWord = 0;
    for(String sen: sentences){
      String[]  word = sen.split(" ");
       if(maxWord < word.length){
           maxWord = word.length;
       }
    }
    System.out.println(maxWord);
  }
}