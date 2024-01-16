import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int lineLength;
        char displaySymbol;
        Scanner scanner = new Scanner(System.in);

        lineLength = Helpers.getIntInput(" Enter line length: ");

        System.out.print(" Enter ONE symbol to display: ");
        displaySymbol = scanner.nextLine().charAt(0);

        System.out.println();

        displayLine(lineLength, displaySymbol);
    }

    public static void displayLine(int lineLength, char displaySymbol){
        int choice;

        do {
            System.out.println(" Choose line direction:");
            System.out.println("  1. Vertical");
            System.out.println("  2. Horizontal");

            choice = Helpers.getIntInput(" Enter field: ");

            switch (choice){
                case 1:
                    for (int i = 0; i < lineLength; i++) {
                        System.out.println(displaySymbol);
                    }
                    break;
                case 2:
                    for (int i = 0; i < lineLength; i++) {
                        System.out.print(displaySymbol);
                    }
                    break;
                default:
                    System.out.println("\n Your input \"" + choice + "\" invalid, try again!\n");
                    break;
            }
        }while (choice != 1 && choice != 2);
    }
}
