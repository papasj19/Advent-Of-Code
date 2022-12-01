import DayOne.ElfCalorieDAO;
import DayOne.ElfManager;

import java.io.FileNotFoundException;

public class Day {

    private ElfCalorieDAO myDAO = new ElfCalorieDAO();



    public void dayOne(){

        try {
            ElfManager myElves = new ElfManager(myDAO.readData("Elfcaloriedata"));
            myElves.transformInfo();
            int maxCal = myElves.findAndPrintMax();
            System.out.println(maxCal);
            int secMax = myElves.findAndSecond(maxCal);
            System.out.println(secMax);
            int thirdMax = myElves.findThird(maxCal,secMax);
            System.out.println(thirdMax);

            int total = maxCal + secMax + thirdMax;
            System.out.println("Total Cals by top 3: " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void dayTwo(){
        System.out.println("Im readyyy");
    }
}
