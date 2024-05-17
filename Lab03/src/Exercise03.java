import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Exercise03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter("student_marks.txt")) {

            while (true) {
                System.out.print("Enter student name (or 'exit' to finish): ");
                String name = scanner.nextLine();

                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter student mark: ");
                String mark = scanner.nextLine();

                writer.println(name + ": " + mark);
            }

            System.out.println("Student marks saved to student_marks.txt");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while trying to save the file.");
            e.printStackTrace();
        }
    }
}