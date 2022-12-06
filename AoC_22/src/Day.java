import DayFive.SupplyStack;
import DayFour.PairIDDAO;
import DayOne.ElfCalorieDAO;
import DayOne.ElfManager;
import DayThree.GroupRucksackManager;
import DayThree.RucksackDAO;
import DayThree.RucksackManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day {



    public void daySix(){
        TuningTroubleDAO theDAO = new TuningTroubleDAO();
       TuningTroubleManager myManager = new TuningTroubleManager(theDAO.read());
        //System.out.println(myManager.analyze());
        System.out.println(myManager.analyzept2());
    }

    public void dayFive() {
        String fileName = "SupplyStackdata";
        SupplyStack SupplyStack = new SupplyStack();
        SupplyStack.read(fileName);
    }

    public void dayFour(){
        PairIDDAO myDAO = new PairIDDAO();
        System.out.println(myDAO.read());
    }

    public void dayThree(){
        RucksackDAO myDAO = new RucksackDAO();
        RucksackManager manager = new RucksackManager(myDAO.read());
        manager.printComLet();

        GroupRucksackManager groupRucksackManager = new GroupRucksackManager(myDAO.readpt2());
        int totalPt2 = groupRucksackManager.determineValue();
        System.out.println(totalPt2);
    }

    public void dayTwo(){
        dataAnalyzer myAnalysis = new dataAnalyzer();
        File file = new File("RPSMatchdata");
        try {
            Scanner fileReader = new Scanner(file);
            int total = 0;
            int temp = 0;
            int temp2 = 0;
            int tot2 = 0;
            do{
                String dataOp = fileReader.next();
                String dataMe = fileReader.next();
                temp = myAnalysis.checkerpt1(dataOp,dataMe);
                temp2 = myAnalysis.checkerpt2(dataOp,dataMe);
                total += temp;
                tot2 += temp2;
            }while(fileReader.hasNext());
            System.out.println("\n\tPart 1: " + total);
            System.out.println("\n\tPart 2: " + tot2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void dayOne(){
        ElfCalorieDAO myDAO = new ElfCalorieDAO();
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








}
