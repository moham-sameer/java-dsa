package kunalDsa.Pattern;

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        numSquare(n);
    }
    public static void numTriangle(int n){
      for(int row = 1;row<=n;row++){
        for(int space=1;space<=n-row;space++){
          System.out.print(" ");
        }
        for(int col = row;col>=1;col--){
          System.out.print(col);
        }
        for(int col = 2;col<=row;col++){
            System.out.print(col);
        }
        System.out.println();
      }
  }
    public static void numSquare(int n){
      int originalN = n+1;
      n = 2*n;
      for(int row = 1; row<=n-1;row++){
        for(int col=1;col<=n-1;col++){
          int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
          System.out.print(atEveryIndex+" ");
        }
        System.out.println("");
      }
    }
    public static void numDiamond(int n){
        for(int row = 1;row<=2*n;row++){
          int totalCol = row>n? 2*n-row:row;
          int totalSpace = n-totalCol;
          for(int space=1;space<=totalSpace;space++){
            System.out.print(" ");
          }
          for(int col = totalCol;col>=1;col--){
            System.out.print(col);
          }
          for(int col = 2;col<=totalCol;col++){
              System.out.print(col);
          }
          System.out.println();
        }
    }
    public static void diamond(int n){
      for(int row=1;row<=2*n;row++){
        int totalColInRow = n < row ? 2*n - row:row;

        int totalSpace = n-totalColInRow;
          for(int space = 1;space<=totalSpace;space++){
               System.out.print(" ");
          }
        for(int col=1;col<=totalColInRow;col++){ 
          System.out.print("* ");
        }
        System.out.println();
      } 
  }
    public static void twotriangle(int n){
        for(int row=1;row<=2*n;row++){
            // for(int space = 1;space<=n-row;space++){
            //      System.out.print(" ");
            // }
             int totalColInRow = n < row ? 2*n - row:row;
          for(int col=1;col<=totalColInRow;col++){ 
            System.out.print("* ");
          }
          System.out.println();
        } 
    }
}
