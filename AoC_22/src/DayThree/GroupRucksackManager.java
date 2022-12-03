package DayThree;

import DayThree.GroupRucksack;

import java.util.ArrayList;

public class GroupRucksackManager {


    ArrayList<GroupRucksack> partTwo;


    public GroupRucksackManager(ArrayList<GroupRucksack> data) {
        this.partTwo = data;
    }

    public int searchGroupLetter(Rucksack one, Rucksack two, Rucksack three){
        int location = 0;
            for (int i = 0; i < one.getEntire().length(); i++) {
                for (int j = 0; j < two.getEntire().length(); j++) {
                    for (int k = 0; k < three.getEntire().length(); k++) {
                        if(one.getEntire().charAt(i) == two.getEntire().charAt(j) && three.getEntire().charAt(k) == two.getEntire().charAt(j))
                            location = i;
                    }
                }
            }

        return location;
    }

    public int determineValue(){
        int location = 0;
        int counter = 0;
        int total = 0;
        for(GroupRucksack guy: partTwo){
            location = searchGroupLetter(guy.getElfOne(), guy.getElfTwo(), guy.getElfThree());
            counter = letterToNumber(guy.getElfOne().getEntire().charAt(location));
            total += counter;
        }
        return total;
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
