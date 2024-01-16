import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        int number;
        int minValue = 100000;
        int maxValue = 999999;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(" Enter a six digit number: ");

            if(!scanner.hasNextInt()){
                System.out.println("\n Your input \"" + scanner.nextLine() + "\" is invalid!");
                continue;
            }

            number = scanner.nextInt();

            if(number < minValue || number > maxValue){
                System.out.println("\n Number \"" + number + "\" is incorrect!");
                continue;
            }

            number = getChangedNumber(number);

            break;
        }while (true);

        System.out.println("\n Result: " + number);
    }

    public static int getChangedNumber(int number){
        int[] digits = new int[6];
        int arrayLength = digits.length;
        int digitsForRearrange = 2;
        int numberGrowIndex = 10;
        int tempInt;

        for (int i = arrayLength - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < digitsForRearrange; i++) {
            tempInt = digits[i];
            digits[i] = digits[arrayLength - (i + 1)];
            digits[arrayLength - (i + 1)] = tempInt;
        }

        //Присваиваю ноль для записи числа из массива
        tempInt = 0;

        for (int digit : digits) {
            tempInt *= numberGrowIndex;
            tempInt += digit;
        }

        return tempInt;
    }
}
