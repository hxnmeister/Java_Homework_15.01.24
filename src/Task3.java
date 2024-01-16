import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int numbersCount = 3;
        int minNumber = 0;
        int maxNumber = 9;
        int numberGrowIndex = 10;
        int finalNumber = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbersCount; i++) {
            System.out.print(" Enter " + (i + 1) + " digit: ");

            do {
                if(!scanner.hasNextInt()){
                    errorMessage(scanner.nextLine(), i + 1);
                    continue;
                }

                int tempInt = scanner.nextInt();

                if(tempInt < minNumber || tempInt > maxNumber){
                    errorMessage(String.valueOf(tempInt), i + 1);
                    continue;
                }

                finalNumber *= numberGrowIndex;
                finalNumber += tempInt;

                break;
            }while (true);
        }

        System.out.println("\n Result: " + finalNumber);
    }

    public static void errorMessage(String value, int index){
        System.out.println("\n Your input \"" + value + "\" is invalid!");
        System.out.print(" Enter " + index + " digit: ");
    }
}
