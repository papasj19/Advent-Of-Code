package DayThree;

import DayThree.Rucksack;

import java.util.ArrayList;

public class RucksackManager {

    ArrayList<Rucksack> current = new ArrayList<>();

    public RucksackManager(ArrayList<String> data) {
        for(String dude: data){
            this.current.add(new Rucksack(dude));
        }
    }



    public void printComLet(){
        int got = 0;
        int temp = 0;
        for(Rucksack dude: current){
            temp = letterToNumber(dude.getCommonLetter());
            got += temp;
        }
        System.out.println("final total pt1: " + got);
    }

    public int letterToNumber(char guy){
        int number = 0;
        if(guy>='a' && guy<= 'z') {
            number = guy - 'a' + 1;
        }else{
            if(guy>='A' && guy<= 'Z') {
                number = guy - 'A' + 27;
            }
        }
        return number;
    }


}
