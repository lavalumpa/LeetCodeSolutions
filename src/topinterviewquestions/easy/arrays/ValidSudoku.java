package topinterviewquestions.easy.arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        return validRow(board) && validColumn(board) && validSquares(board);
    }

    public boolean validRow (char [][]board){
        for (int i=0; i<9; i++){
            boolean []flag= new boolean [10];
            for (int j=0; j<9; j++){
                if (board[i][j]>='0' && board [i][j]<='9'){
                    if (flag[(board[i][j] - '0')]){
                        return false;
                    }
                    flag[board[i][j]-'0']=true;
                }
            }
        }
        return true;
    }


    public boolean validColumn (char [][]board){
        for (int j=0; j<9; j++){
            boolean []flag= new boolean [10];
            for (int i=0; i<9; i++){
                if (board[i][j]>='0' && board [i][j]<='9'){
                    if (flag[board[i][j] - '0']){
                        return false;
                    }
                    flag[board[i][j]-'0']=true;
                }
            }
        }
        return true;
    }

    public boolean validSquares(char [][] board){
        for (int i=0; i<9; i+=3){
            for (int j=0; j<9; j+=3){
                if (!squareCheck(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean squareCheck (char [][]board, int row, int column){
        boolean []flag= new boolean [10];
        for (int i=row; i<3+row; i++){
            for (int j=column; j<3+column; j++){
                if (board[i][j]>='0' && board [i][j]<='9'){
                    if (flag[board[i][j] - '0']){
                        return false;
                    }
                    flag[board[i][j]-'0']=true;
                }
            }
        }
        return true;
    }
}
