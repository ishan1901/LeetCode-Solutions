public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int rowLength = board.length;
        int colLength = board[0].length;
        int[][] matrix = new int[rowLength][colLength];
        int countOne;
        for (int row = 0;row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                countOne = 0;
                if(row > 0 && col > 0 && board[row-1][col-1] == 1) {countOne++;}
                if(row < rowLength-1 && col < colLength-1 && board[row+1][col+1] == 1) { countOne++;}
                if(col < colLength-1 && board[row][col+1] == 1) { countOne++; }
                if(col > 0 && board[row][col - 1] == 1) { countOne++; }
                if(row < rowLength-1 && board[row+1][col] == 1) {countOne++;}
                if(row >0 && board[row-1][col] == 1) {countOne++;}
                if(row > 0 && col < colLength-1 && board[row-1][col+1] == 1) {countOne++;}
                if(row < rowLength-1 && col > 0 && board[row+1][col-1] == 1) {countOne++;}
                
                //Logic
                if (countOne == 3 && board[row][col] == 0) {matrix[row][col] = 1;}
                else if ((countOne ==2 || countOne == 3) && board[row][col] == 1) {matrix[row][col] = 1;}
                else {matrix[row][col] = 0;}
            }
        }
        for (int row = 0;row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                board[row][col] = matrix[row][col];
            }
        }
        
    }
}
