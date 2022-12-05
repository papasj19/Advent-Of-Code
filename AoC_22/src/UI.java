import java.util.Scanner;

public class UI {

    Scanner scanner = new Scanner(System.in);
    Day today = new Day();

    public int askGrouping(){
        System.out.println("""
                Please select the group of days to choose from
                    1. Days 1-5
                    2. Days 6-10
                    3. Days 10-15(ojala)
                
                Input: """);
        return scanner.nextInt();
    }

    public void runGrouping(){
        switch (askGrouping()){
            case 1:
                runDay15();
                break;

            case 2:
                runDay610();
                break;
        }
    }


    public int askDay610(){
        System.out.print("""
                Please select the numerical value of the day to be ran
                    1. Day 6
                    2. Day 7
                    3. Day 8
                    4. Day 9
                    5. Day 10
                    
                Input: """);
        return scanner.nextInt();
    }

    public int askDay15(){
        System.out.print("""
                Please select the numerical value of the day to be ran
                    1. Day 1
                    2. Day 2
                    3. Day 3
                    4. Day 4
                    5. Day 5
                    
                Input: """);
       return scanner.nextInt();
    }

    public void runDay15(){
        switch (askDay15()){
            case 1:
                today.dayOne();
                break;

            case 2:
                today.dayTwo();
                break;

            case 3:
                today.dayThree();
                break;

            case 4:
                today.dayFour();
                break;

            case 5:
                today.dayFive();
                break;
        }
    }


    public void runDay610(){
        switch (askDay610()){
            case 6:
                today.dayOne();
                break;

            case 7:
                today.dayTwo();
                break;

            case 8:
                today.dayThree();
                break;
        }
    }

}
