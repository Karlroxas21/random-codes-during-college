package FundamentalsOfProgramming;

public class MajorleagueA {
    static int[][]  newArray(int [][]A, int[][] B){
        int row1 = 2;
        int row2 = 3;
        int col1 = 3;
        int col2 = 2;
        int [][] stock = new int[row1][col2];
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                for(int k = 0; k < col1; k++){
                    stock[i][j] += (A[i][k] * B[k][j]) + B[k][j];
                }

            }
        }
        System.out.println("array C: ");
        for(int[] r : stock){
            for(int c : r){
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println("");
        }
        return stock;

    }
   void call(){
        int [][] A = {{1, 2, 3}, {4, 5, 6}};
        int [][] B = {{11, 12}, {14, 15}, {17, 18}};
        newArray(A, B);

    }
}
