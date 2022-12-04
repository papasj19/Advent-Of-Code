package DayFour;

public class PairID {

    private int startingA;
    private int endingA;
    private int startingB;
    private int endingB;
    private boolean rangeContained;

    public void setRangeContained(boolean rangeContained) {
        this.rangeContained = rangeContained;
    }

    public boolean isRangeContained() {
        return rangeContained;
    }

    public int getLengthOne(){
        return endingA - startingA;
    }

    public int getLengthTwo(){
        return endingB - startingB;
    }

    public PairID(int startingA, int endingA, int startingB, int endingB) {
        this.startingA = startingA;
        this.endingA = endingA;
        this.startingB = startingB;
        this.endingB = endingB;
    }

    public void setStartingA(int startingA) {
        this.startingA = startingA;
    }

    public void setEndingA(int endingA) {
        this.endingA = endingA;
    }

    public void setStartingB(int startingB) {
        this.startingB = startingB;
    }

    public void setEndingB(int endingB) {
        this.endingB = endingB;
    }

    public int getStartingA() {
        return startingA;
    }

    public int getEndingA() {
        return endingA;
    }

    public int getStartingB() {
        return startingB;
    }

    public int getEndingB() {
        return endingB;
    }
}
