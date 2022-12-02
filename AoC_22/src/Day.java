import DayOne.ElfCalorieDAO;
import DayOne.ElfManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        dataAnalyzer myAnalysis = new dataAnalyzer();
        File file = new File("RPSMatchdata");
        try {
            Scanner fileReader = new Scanner(file);
            int total = 0;
            int temp = 0;
            do{
                String dataOp = fileReader.next();
                String dataMe = fileReader.next();
                temp = myAnalysis.checker(dataOp,dataMe);
                total += temp;
            }while(fileReader.hasNext());
            System.out.println("\n\tPart 1: " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }





}
