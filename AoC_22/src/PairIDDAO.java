import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PairIDDAO {

    public PairIDDAO() {
    }


    public int read(){
        File file = new File("PairIDdata");
        ArrayList<PairID> toReturn = new ArrayList<>();
        int total = 0;
        int totalpt2 = 0;
        try {
            Scanner fileReader = new Scanner(file);
            do{
                String first = fileReader.nextLine();
                String[] firstSplit = first.split(",");
                String[] firstFirstSplit = firstSplit[0].split("-");
                String[] secondFirstSplit = firstSplit[1].split("-");
                int startO = Integer.parseInt(firstFirstSplit[0]);
                int end0 = Integer.parseInt(firstFirstSplit[1]);
                int startT = Integer.parseInt(secondFirstSplit[0]);
                int endT = Integer.parseInt(secondFirstSplit[1]);

                if(analyze(startO,end0,startT,endT)){
                    total++;
                }
                if(analyzept2(startO,end0,startT,endT)) {
                    totalpt2++;
                }

            }while(fileReader.hasNext());
            System.out.println("total pt 2: " + totalpt2);
            return total;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      return total;


    }

    public boolean analyzept2(int first, int second, int third, int four){
        if (first >= third && first <= four) {
            return true;
        } else if (second >= third && second <= four) {
            return true;
        } else if (third >= first && third <= second) {
            return true;
        } else if (four >= first && four <= second) {
            return true;
        }
        return false;
    }


    public boolean analyze(int s0, int e0, int sT, int eT){
        boolean answer = false;
        if(s0 >=sT && e0 <= eT){
                answer = true;
        }else{
            if(sT>= s0 && e0>=eT){
                    answer = true;

            }
        }
        return answer;
    }
}
