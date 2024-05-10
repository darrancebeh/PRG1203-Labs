import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int arrSize = scanner.nextInt();

            int[] numList = new int[arrSize];

            int success = 0;
            while(success < arrSize) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                boolean isDuplicate = false;
                for (int i = 0; i < success; i++) {
                    if (numList[i] == number) {
                        isDuplicate = true;
                        break;
                    }
                }

                if(isDuplicate) {
                    System.out.println("Duplicate number. Try again.");
                    continue;
                } else {
                    numList[success] = number;
                    for (int i = 0; i <= success; i++) {
                        System.out.print(numList[i] + " ");
                    }
                    System.out.print("\n");
                    success++;
                }    
            }
        }

    }
}

