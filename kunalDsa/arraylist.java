package kunalDsa;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the no. rows:-");
         int r = in.nextInt();
         System.out.print("Enter the no. of cols:-");
         int c = in.nextInt();
         //? initialization.
         for(int i = 0;i<r;i++){
            list.add(new ArrayList<>());
         }
         // ? elements adding.
         System.out.print("Enter the no. of elements:-");
         for(int i = 0; i<r;i++){
            for(int j = 0;j<c;j++){
                list.get(i).add(in.nextInt());
            }
         }


        System.out.println(list);
    }
}
