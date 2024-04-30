import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a five digit integer: ");
            int n = scanner.nextInt();

            String nString = Integer.toString(n);
            System.out.printf("The digits in %d are: ", n);
            for(int i = 0; i < 5; i++) {
                System.out.printf("%c ", nString.charAt(i));
            }
        }
    }
}