public class TuningTroubleManager {

    private String data;

    private static boolean[] recent;

    public TuningTroubleManager(String data) {
        this.data = data;
        this.recent = new boolean[26];
    }

    public int analyzept2(){
        int index = 0;
        resetArray();
        startpt2(index);
        for (int i = 15; i < data.length(); i++) {
            if(checkValue() == 14){
                break;
            }
            resetArray();
            index++;
            startpt2(index);
        }

        return index+14;
    }


    public void startpt2(int value){
        for (int i = value; i < 14+value; i++) {
            int location = giveValue(data.charAt(i));
            recent[location-1] = true;
        }
    }

    public int checkValue(){
        int counter = 0;
        for (int i = 0; i < recent.length; i++) {
            if(recent[i]){
                counter++;
            }
        }
        return counter;
    }

    public int analyze(){
        boolean[] recent = new boolean[26];
        int iterations = 0;
        for (int i = 4; i < data.length(); i++) {
            iterations++;
            int fourth = giveValue(data.charAt(i-3));
            int third = giveValue(data.charAt(i-2));
            int second = giveValue(data.charAt(i-1));
            int first = giveValue(data.charAt(i));
            if(checkValues(first,second,third,fourth)){
                break;
            }
        }

        //small 30
        //big 4095


        return iterations+4;
    }

    public boolean checkValues(int one, int two, int three, int four){
        if(one != two && one != three && one != four && two != three && two != four && three != four){
            return true;
        }else{
            return false;
        }
    }

    public int giveValue(char toConvert){
        return toConvert - 'a' + 1;
    }

    public static void resetArray(){
        for (int i = 0; i < recent.length; i++) {
            recent[i] = false;
        }
    }


}
