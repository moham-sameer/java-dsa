package topInterview.Array_String;

public class zigzag {
    public static void main(String[] args) {
       String s = "PAYPALISHIRING" ;
       int numRows = 3;
       System.out.println(convert(s, numRows));
    }
    public static String convert(String s, int numRows){
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i<numRows;i++){
           rows[i] = new StringBuilder();

        }
        int currentRow = 0; 
        Boolean flag = false;
        for(char c : s.toCharArray()){
            rows[currentRow].append(c);
            if(currentRow == 0 || currentRow == numRows - 1){
                flag = !flag;
            }
            currentRow += flag ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }

}
