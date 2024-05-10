import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name (-1 to end loop): ");
            String name = scanner.nextLine();

            ArrayList<String> nameList = new ArrayList<String>();

            while(!name.equals("-1")) {
                boolean isDuplicate = false;
                for (int i = 0; i < nameList.size(); i++) {
                    if (nameList.get(i).equalsIgnoreCase(name)) {
                        System.out.println("Duplicate name. Try again.");
                        isDuplicate = true;
                        break;
                    }
                } 
                if (!isDuplicate) {
                    name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
                    nameList.add(name);
                }

                System.out.print("Enter name (-1 to end loop): ");
                name = scanner.nextLine();
            }

            System.out.println("The names you entered are:");
            for(int j = 0; j < nameList.size(); j++){
                System.out.print(nameList.get(j));
                if (j != nameList.size() - 1){
                    System.out.print(", ");
                }
            }

            System.out.print("\nEnter a name to be deleted (-1 to skip this step):");
            String nameToDelete = scanner.nextLine();
            
            while(!nameToDelete.equals("-1")) {
                boolean isFound = false;
                for(int k = 0; k < nameList.size(); k++) {
                    if(nameList.get(k).equalsIgnoreCase(nameToDelete)) {
                        nameList.remove(k);
                        System.out.println("Name deleted.");
                        isFound = true;
                        break;
                    }
                }

                if(!isFound) {
                    System.out.println("Name not found. Try again.");
                }

                System.out.print("Enter a name to be deleted (-1 to skip this step):");
                nameToDelete = scanner.nextLine();
            }

            System.out.println("The final name list is:");
            for(int i = 0; i < nameList.size(); i++){
                System.out.print(nameList.get(i));
                if (i != nameList.size() - 1){
                    System.out.print(", ");
                }
            }
        }
    }
}