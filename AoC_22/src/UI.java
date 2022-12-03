import java.util.Scanner;

public class UI {

    Scanner scanner = new Scanner(System.in);
    Day today = new Day();




    public int askDay(){
        System.out.print("""
                Please select the numerical value of the day to be ran
                    1. Day 1
                    2. Day 2
                    3. Day 3
                    4. Day 4
                    
                Input: """);
       return scanner.nextInt();
    }

    public void runDay(){
        switch (askDay()){
            case 1:
                today.dayOne();
                break;

            case 2:
                today.dayTwo();
                break;

            case 3:
                today.dayThree();
                break;
        }
    }

}
