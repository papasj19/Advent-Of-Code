import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoSpaceLeftDAO {

    public NoSpaceLeftDAO() {
    }
    
    public String[] read(){
        File file = new File("NoSpaceLeftOnDeviceSm");
        String[] data = new String[14];
        int index = 0;
        try {
            Scanner fileReader = new Scanner(file);
            
            do{
                data[index] = fileReader.nextLine();
                index++;
            }while(fileReader.hasNext());
        } catch (FileNotFoundException e) {
            
        }
        return data;
    }
}
