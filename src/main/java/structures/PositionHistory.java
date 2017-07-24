package structures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurudeenlawal on 7/16/17.
 */
public class PositionHistory {

    private ArrayList<Position> historicalPositions = new ArrayList<>();

    public ArrayList<Position> getHistoricalPositions() {
        return historicalPositions;
    }

    public void setHistoricalPositions(ArrayList<Position> historicalPositions) {
        this.historicalPositions = historicalPositions;
    }
}
