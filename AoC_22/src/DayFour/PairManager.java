package DayFour;

import DayFour.PairID;

import java.util.ArrayList;

public class PairManager {

    ArrayList<PairID> currentPairs;

    public PairManager(ArrayList<PairID> data) {
        this.currentPairs = data;
        determineIfRepeated();
    }

    public void determineIfRepeated(){
        for(PairID dude: currentPairs){
            int startO = dude.getStartingA();
            int endO = dude.getEndingA();
            int startT = dude.getStartingB();
            int endT = dude.getEndingB();
            if(startT >= startO && endT<= endO && dude.getLengthTwo() < dude.getLengthOne()){
                dude.setRangeContained(true);
                //System.out.println("allowed" + startO +" " +startT + "endings "+ endO + "end two " + endT);
            }
                if(startO >= startT && endO <= endT && dude.getLengthOne() < dude.getLengthTwo()){
                    dude.setRangeContained(true);
                    //System.out.println("allowed" + startO +" " +startT + "endings "+ endO  + "end two " + endT);
                }


        }
    }

    public int calcNumberRepeated(){
        int total = 0;
        for(PairID guy: currentPairs){
            if(guy.isRangeContained()){
                total++;
            }
        }
        return total;
    }
}
