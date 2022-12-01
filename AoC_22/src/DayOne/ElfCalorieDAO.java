package DayOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElfCalorieDAO {

    private final String numberSeparator = "\n";
    private final String elfSeparator = "\n\n";

    public int[] readData(String path) throws FileNotFoundException{
        File file = new File("Elfcaloriedata");
        Scanner fileReader = new Scanner(file);
        int[] current = new int[500];
        int indexMax = 0;
        int max = 0;
        int index = 0;
        while(fileReader.hasNextInt()) {
            String data = fileReader.nextLine();
            if(!data.equals("")){
                int parsed = Integer.parseInt(data);
                current[index] += parsed;
            }else{
                index++;
                current[index] = 0;
            }

        }
        return current;
    }
}
