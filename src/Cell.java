/**
 * Created by ostk on 01/06/15.
 */
public class Cell {

    private int val;
    private boolean possibleVals[] = new boolean[9];

    public Cell(){
        val = 0;
        for(int i=0; i<9; i++){
            possibleVals[i]=true;
        }
    }

    public void set(int v){
        val = v;
        for(int i=0; i<9; i++){
            possibleVals[i]=false;
        }
    }

    public void eliminate(int i){
        possibleVals[i-1] = false;
    }


}
