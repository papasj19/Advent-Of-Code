package DayOne;

public class Elf {

    private int Calories;
    private int numPackages;
    private boolean isMax;

    public Elf(int calories, int numPackages, boolean isMax) {
        Calories = calories;
        this.numPackages = numPackages;
        this.isMax = isMax;
    }

    public Elf(int calories) {
        Calories = calories;
    }

    public int getCalories() {
        return Calories;
    }

    public void setMax(boolean max) {
        isMax = max;
    }
}
