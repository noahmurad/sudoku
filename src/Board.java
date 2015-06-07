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
        Cell reg_vals[] = new Cell[9];
        int rootCell[] = int_to_regionCoords(n);

        int i=0;
        for(int j=0; j<3; j++){
            for(int k=0; k<3; k++){
                reg_vals[i]=board[ rootCell[0]+j ][ rootCell[1]+k ];
            }
        }
        return reg_vals;
    }

    //returns the root cell (upper left)  coordinate of a region number
    private int[] int_to_regionCoords(int i){
        int coord[]= new int[2];
        switch (i){
            case 1:
            case 2:
            case 3: coord[0]=0;
                    break;
            case 4:
            case 5:
            case 6: coord[0]=3;
                    break;
            case 7:
            case 8:
            case 9: coord[0]=6;
        }
        switch (i){
            case 1:
            case 4:
            case 7: coord[1]=0;
                    break;
            case 2:
            case 5:
            case 8: coord[1]=3;
                    break;
            case 3:
            case 6:
            case 9: coord[1]=6;
        }

        return coord;
    }

    //returns the root cell of a region containing the cell at i,j
    private int[] coords_to_regionCoords(int i, int j){
        int coord[]= new int[2];
        if(i<3){
            coord[0]=0;
        }else if(i<6){
            coord[0]=3;
        }else{
            coord[0]=6;
        }

        if(j<3){
            coord[1]=0;
        }else if(j<6){
            coord[1]=3;
        }else{
            coord[1]=6;
        }

        return coord;
    }
}
