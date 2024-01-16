import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int numberGrowIndex = 10;
        int numbersCount = 3;
        int finalNumber = 0;
        int minNumber = 0;
        int maxNumber = 9;

        for (int i = 0; i < numbersCount; i++) {

            finalNumber *= numberGrowIndex;
            finalNumber += Helpers.getIntDiapazonInput(" Enter " + (i + 1) + " digit: ", minNumber, maxNumber);
        }

        System.out.println("\n Result: " + finalNumber);
    }
}
