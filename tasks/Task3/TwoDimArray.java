package tasks.Task3;

public class TwoDimArray {
    public static void main(String[] args){
        int row = 3;
        int col = 4;
        int[][] twoDArray = new int[row][col];
        int value = 1;
        System.out.println("The twoD array is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                twoDArray[i][j]=value;
                System.out.print(twoDArray[i][j]+" ");
                value++;
            }
            System.out.println();
        }
    }
    
}
