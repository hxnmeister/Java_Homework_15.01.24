import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int number;
        int percent;

        number = Helpers.getIntInput(" Enter number: ");
        percent = Helpers.getIntInput(" Enter percent: ");

        System.out.println("\n Result: " + (double)(number * percent) / 100);
    }
}
