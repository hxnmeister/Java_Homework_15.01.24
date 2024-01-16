import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] randomArray = new double[random.nextInt(10, 22)];

        System.out.print(" Array: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextDouble(-20, 20);

            System.out.printf("%.3f ",randomArray[i]);
        }

        sortingArray(randomArray);

        System.out.println();

        System.out.print(" Sorted array: ");
        for (double item : randomArray) {
            System.out.printf("%.3f ", item);
        }
    }

    public static void sortingArray(double[] array){
        int choice;
        double tempInt;

        do {
            System.out.println("\n Choose sorting order:");
            System.out.println("  1. Ascending");
            System.out.println("  2. Descending");

            choice = Helpers.getIntInput(" Enter field:");

            switch (choice){
                case 1:
                    Arrays.sort(array);
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        for (int j = i; j < array.length; j++) {
                            if(array[i] < array[j]){
                                tempInt = array[i];
                                array[i] = array[j];
                                array[j] = tempInt;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("\n Your input \"" + choice + "\" is incorrect!");
                    break;
            }
        }while (choice != 1 && choice != 2);
    }
}
