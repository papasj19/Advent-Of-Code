package DayThree;

import DayThree.GroupRucksack;
import DayThree.Rucksack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RucksackDAO {

    public RucksackDAO() {
    }

    public ArrayList<GroupRucksack> readpt2(){
        File file = new File("Rucksackdata");
        ArrayList<GroupRucksack> toReturn = new ArrayList<>();
        try {
            Scanner fileReader = new Scanner(file);
            do{
                String tempRuck = fileReader.next();
                String tempRuck2 = fileReader.next();
                String tempRuck3 = fileReader.next();
                toReturn.add(new GroupRucksack(new Rucksack(tempRuck), new Rucksack(tempRuck2), new Rucksack(tempRuck3)));
            }while(fileReader.hasNext());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return toReturn;

    }

    public ArrayList<String> read(){
        File file = new File("Rucksackdata");
        ArrayList<String> toReturn = new ArrayList<>();
        try {
            Scanner fileReader = new Scanner(file);
            do{
                String tempRuck = fileReader.next();
                toReturn.add(tempRuck);
            }while(fileReader.hasNext());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return toReturn;

    }
}
