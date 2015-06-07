/**
 * Created by ostk on 01/06/15.
 */
public class Board {
    private Cell board[][] = new Cell[9][9];

    public Board(){
        //fill the board with empty cells
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                board[i][j]= new Cell();
            }
        }

    }

    public void setCell(int value, int i, int j){
        board[i][j].set(value);
    }

    //returns all values in row r
    public Cell[] rowIterator(int n){
        Cell row_vals[] = new Cell[9];
        for(int i=0; i<9; i++){
            row_vals[i]= board[n][i];
        }
        return row_vals;
    }

    //returns all values in column r
    public Cell[] colIterator(int n){
        Cell col_vals[] = new Cell[9];
        for(int i=0; i<9; i++){
            col_vals[i]= board[i][n];
        }
        return col_vals;
    }

    //returns all values in region r
    public Cell[] regIterator(int n){

    }
}
