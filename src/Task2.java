import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int number;
        int percent;

        number = getNumber(" Enter number: ");
        percent = getNumber(" Enter percent: ");

        System.out.println("\n Result: " + (double)(number * percent) / 100);
    }

    public static int getNumber(String inputMessage){
        Scanner scanner = new Scanner(System.in);
        boolean isInputInt = false;

        do {
            System.out.print(inputMessage);
            isInputInt = scanner.hasNextInt();

            if(!isInputInt){
                System.out.println("Your input \"" + scanner.nextLine() + "\" is invalid");
                System.out.println("You need to input a number!\n");

                continue;
            }
        }while (!isInputInt);

        return scanner.nextInt();
    }
}
