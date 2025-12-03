import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static List<String> readInstructions(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    public static void dayOne(){
        try {
            int currentPosition = 50;
            int part1 = 0;
            int part2 = 0;
            List<String> lines = readInstructions("input.txt");
            for (String line : lines) {
                char dir = line.charAt(0);
                int value = Integer.parseInt(line.substring(1));

                // Part 2: simulate each click
                for (int i = 0; i < value; i++) {
                    if (dir == 'L') {
                        currentPosition = (currentPosition + 99) % 100;  // -1 mod 100
                    } else { // 'R'
                        currentPosition = (currentPosition + 1) % 100;
                    }

                    if (currentPosition == 0) {
                        part2++;
                    }
                }

                // Part 1: after the full rotation
                if (currentPosition == 0) {
                    part1++;
                }
            }

            System.out.println("Part 1 - Landed on 0: " + part1);
            System.out.println("Part 2 - Passed/Landed on 0: " + part2);
        }catch(IOException e){
            System.out.println("Error reading instructions: " + e.getMessage());
        }
    }



    public static void main(String[] args) {

       dayOne();

    }



}