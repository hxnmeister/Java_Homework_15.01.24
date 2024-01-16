import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] randomArray = new int[15];
        int[] evenNumbers = new int[0];
        int[] oddNumbers = new int[0];
        int[] negativeNumbers = new int[0];
        int[] positiveNumbers = new int[0];
        Random random = new Random();

        System.out.print("\n Array: ");
        
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(-20, 20);

            if(randomArray[i] % 2 == 0){
                evenNumbers = addElementToArray(evenNumbers, randomArray[i]);
            }
            else {
                oddNumbers = addElementToArray(oddNumbers, randomArray[i]);
            }

            if(randomArray[i] >= 0){
                positiveNumbers = addElementToArray(positiveNumbers, randomArray[i]);
            }
            else{
                negativeNumbers = addElementToArray(negativeNumbers, randomArray[i]);
            }

            System.out.print(randomArray[i] + " ");
        }

        System.out.println();

        if(evenNumbers.length > 0){
            displayArrayInfo(evenNumbers, "\n Even numbers: ");
        }

        if(oddNumbers.length > 0){
            displayArrayInfo(oddNumbers, "\n Odd numbers: ");
        }

        if(positiveNumbers.length > 0){
            displayArrayInfo(positiveNumbers, "\n Positive numbers: ");
        }

        if(negativeNumbers.length > 0){
            displayArrayInfo(negativeNumbers, "\n Negative numbers: ");
        }


    }

    public static int[] addElementToArray(int[] array, int value){
        int[] tempArray = Arrays.copyOf(array, array.length + 1);
        tempArray[tempArray.length - 1] = value;

        return tempArray;
    }

    public static void displayArrayInfo(int[] array, String message){
        System.out.print(message);
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
