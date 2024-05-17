import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("student_marks.txt"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while trying to read the file.");
            e.printStackTrace();
        }
    }
}