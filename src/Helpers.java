import java.util.Scanner;

public class Helpers {
    public static int getIntDiapazonInput(String inputMessage, int minValue, int maxValue){
        int value;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(inputMessage);

            if(!scanner.hasNextInt()){
                System.out.println("\n Your input \"" + scanner.nextLine() + "\" is invalid!");
                continue;
            }

            value = scanner.nextInt();

            if(value < minValue || value > maxValue){
                System.out.println("\n Number \"" + value + "\" is incorrect!");
                continue;
            }

            break;
        }while (true);

        return value;
    }
    public static int getIntInput(String inputMessage){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(inputMessage);

            if(!scanner.hasNextInt()){
                System.out.println("Your input \"" + scanner.nextLine() + "\" is invalid");
                System.out.println("You need to input a number!\n");

                continue;
            }
        }while (!scanner.hasNextInt());

        return scanner.nextInt();
    }
}
