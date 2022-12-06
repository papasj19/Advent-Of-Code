package DayFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SupplyStack {

    private String currentInstruction = new String("null");

    //private String[] stack1 = {"Z","N"};
    //private String[] stack2 = {"M","C","D"};
    //private String[] stack3 = {"P"};

   private String[] stack1 = {"D","T","W","F","J","S","H","N"};
    private String[] stack2 = {"H","R","P","Q","T","N","B","G"};
   private String[] stack3 = {"L","Q","V"};
    private String[] stack4 = {"N","B","S","W","R","Q"};
    private String[] stack5 = {"N","D","F","T","V","M","B"};
    private String[] stack6 = {"M","D","B","V","H","T","R"};
    private String[] stack7 = {"D","B","Q","J"};
    private String[] stack8 = {"D","N","J","V","R","Z","H","Q"};
    private String[] stack9 = {"B","N","H","M","S"};

    public void runPartOne(int numMove, int source, int dest){
        String[] removeFrom = giveStackbyInt(source);
        String[] addToo = giveStackbyInt(dest);
        String[] aux = new String[numMove];
        String[] auxTwo = new String[addToo.length+numMove];
        int test = removeFrom.length-numMove;
        String[] auxThree = new String[removeFrom.length-numMove];
        int index = 0;
        //new array with information removed
        for (int i = 0; i < removeFrom.length-numMove; i++) {
            auxThree[i] = removeFrom[i];
        }
        //obtain letters to move

        for(int i = removeFrom.length-numMove;index <numMove; i++){
            aux[index] = removeFrom[removeFrom.length-index-1];
            index++;
        }
        //fill auxiliary with old info
        for (int i = 0; i < addToo.length; i++) {
            auxTwo[i] = addToo[i];
        }
        //fill auxiliary with new info
        for (int i = 0; i < aux.length; i++) {
            auxTwo[addToo.length+i] = aux[i];
        }
        //erase info
        rewriteStackbyInt(source,auxThree);
        //write info
        rewriteStackbyInt(dest,auxTwo);

    }

    public void runPartTwo(int numMove, int source, int dest){
        String[] removeFrom = giveStackbyInt(source);
        String[] addToo = giveStackbyInt(dest);
        String[] aux = new String[numMove];
        String[] auxTwo = new String[addToo.length+numMove];
        int test = removeFrom.length-numMove;
        String[] auxThree = new String[removeFrom.length-numMove];
        int index = 0;
        //new array with information removed
        for (int i = 0; i < removeFrom.length-numMove; i++) {
            auxThree[i] = removeFrom[i];
        }
        //obtain letters to move

        for(int i = removeFrom.length-numMove;index <numMove; i++){
            aux[index] = removeFrom[i];
            index++;
        }
        //fill auxiliary with old info
        for (int i = 0; i < addToo.length; i++) {
            auxTwo[i] = addToo[i];
        }
        //fill auxiliary with new info
        for (int i = 0; i < aux.length; i++) {
            auxTwo[addToo.length+i] = aux[i];
        }
        //erase info
        rewriteStackbyInt(source,auxThree);
        //write info
        rewriteStackbyInt(dest,auxTwo);

    }

    public void setCurrentInstruction(String currentInstruction) {
        this.currentInstruction = currentInstruction;
    }

    public void rewriteStackbyInt(int num, String[] newStack){
        switch (num) {
            case 1:
                stack1 = newStack;
                break;
            case 2:
                stack2 = newStack;
                break;
            case 3:
                stack3 = newStack;
                break;
            case 4:
                stack4 = newStack;
                break;
            case 5:
                stack5 = newStack;
                break;
            case 6:
                stack6 = newStack;
                break;
            case 7:
                stack7 = newStack;
                break;
            case 8:
                stack8  = newStack;
                break;
            case 9:
                stack9  = newStack;
                break;
        }
    }

    public String runSmallSet(){
        String message;
        message = stack1[stack1.length-1] + stack2[stack2.length-1] + stack3[stack3.length-1];
        return message;
    }

    public String runLargeSet(){
        String message;
        message = stack1[stack1.length-1] + stack2[stack2.length-1] + stack3[stack3.length-1] + stack4[stack4.length-1] + stack5[stack5.length-1] + stack6[stack6.length-1] + stack7[stack7.length-1] + stack8[stack8.length-1] + stack9[stack9.length-1];
        return message;
    }

    public String[] giveStackbyInt(int num){
        switch (num) {
            case 1:
                return stack1;
            case 2:
                return stack2;
            case 3:
                return stack3;
            case 4:
                return stack4;
            case 5:
                return stack5;
            case 6:
                return stack6;
            case 7:
                return stack7;
            case 8:
                return stack8;
            case 9:
                return stack9;
        }
        return null;
    }



    public void read(String path){
        File file = new File(path);

        try {
            Scanner fileReader = new Scanner(file);

            do {


                String temp = fileReader.nextLine();
                //setCurrentInstruction("Instruction: " + temp);
                String tempString;
                if(temp.charAt(6) != ' '){
                    tempString = Character.toString(temp.charAt(5)) + Character.toString(temp.charAt(6));

                }else{
                    tempString = Character.toString(temp.charAt(5));
                }
                int numMove = Integer.parseInt(tempString);
                int sourceStack;
                int destinationStack;
                if(numMove <= 9) {
                    sourceStack = Integer.parseInt(Character.toString(temp.charAt(12)));
                    destinationStack= Integer.parseInt(Character.toString(temp.charAt(17)));
                }else{
                    sourceStack = Integer.parseInt(Character.toString(temp.charAt(13)));
                    destinationStack= Integer.parseInt(Character.toString(temp.charAt(18)));
                }

                runPartOne(numMove,sourceStack,destinationStack);
                //runPartTwo(numMove,sourceStack,destinationStack);
            }while(fileReader.hasNext());

            //System.out.println(runSmallSet());
            System.out.println(runLargeSet());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
