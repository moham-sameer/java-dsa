package kunalDsa;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           System.out.print("Enter the no. of rows:-");
           int r = in.nextInt();
           System.out.print("Enter the no. of cols:-");
           int c = in.nextInt();
           int[][] biscuits = new int[r][c];
           System.out.println("Enter the elements:- ");
           for(int rows = 0;rows<biscuits.length;rows++){
            for(int cols = 0; cols<biscuits[rows].length;cols++){
                     biscuits[rows][cols] = in.nextInt();
            }
           }
        //    ! This is the basic code for output of 2d array
        //    for(int rows = 0;rows<biscuits.length;rows++){
        //     for(int cols=0;cols<biscuits[rows].length;cols++){
        //         System.out.println(biscuits[rows][cols]+" ");
        //     }
        //    }
            //  ! And this is the shortest code for the same purpose
        //    for(int rows = 0;rows<biscuits.length;rows++){
        //               System.out.print(Arrays.toString(biscuits[rows])+" ");
          
        //    }
            // ! and this is even more shorter code to get the output.
        //    for(int[] a : biscuits){
        //        System.out.println(Arrays.toString(a)); 
        //    }
    }
}
