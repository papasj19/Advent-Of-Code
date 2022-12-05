import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class newDAO {

    public newDAO() {

    }

    public void read(String path){
        File file = new File(path);

        try {
            Scanner fileReader = new Scanner(file);

            do {
                String temp = fileReader.next();
            }while(fileReader.hasNext());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
