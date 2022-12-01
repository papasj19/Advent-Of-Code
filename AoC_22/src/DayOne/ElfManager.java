package DayOne;

import DayOne.Elf;

import java.util.ArrayList;

public class ElfManager {

    private ArrayList<Elf> currentElves = new ArrayList<>();
    private int[] info;

    public ElfManager(int[] info) {
        this.info = info;
    }


    public void transformInfo(){
        for(int guy: info){
            Elf newElf = new Elf(guy);
            currentElves.add(newElf);
        }
    }

    public int findAndPrintMax(){
        int maxCal = 0;
        for(Elf dude: currentElves){
            if(dude.getCalories() > maxCal){
                dude.setMax(true);
                maxCal = dude.getCalories();
            }
        }
        return maxCal;
    }

    public int findAndSecond(int max){
        int secmax = 0;
        for(Elf dude: currentElves){
            if(dude.getCalories() > secmax && dude.getCalories() != max){
                secmax = dude.getCalories();
            }
        }
        return secmax;
    }

    public int findThird(int max, int secmax){
        int thirdmax = 0;
        for(Elf dude: currentElves){
            if(dude.getCalories() > thirdmax && dude.getCalories() != max && dude.getCalories() != secmax){
                thirdmax = dude.getCalories();
            }
        }
        return thirdmax;
    }
}
