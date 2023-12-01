package DaySix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TuningTroubleDAO {

    public TuningTroubleDAO() {
    }

    public String read(){
        File file = new File("TuningTrouble");
        String received = null;
        try {
            Scanner fileReader = new Scanner(file);
            do{
                received = fileReader.nextLine();
            }while(fileReader.hasNext());

            return received;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return received;
    }
}
