import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] randomArr = new int[18];
        int minArrValue = 0;
        int maxArrValue = 0;
        int countOfNegative = 0;
        int countOfPositive = 0;
        Random random = new Random();

        System.out.print("\n Array: ");
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(-20, 20);

            if(randomArr[i] < minArrValue){
                minArrValue = randomArr[i];
            }
            else if (randomArr[i] > maxArrValue) {
                maxArrValue = randomArr[i];
            }

            if(randomArr[i] > 0){
                ++countOfPositive;
            }
            else if(randomArr[i] < 0){
                ++countOfNegative;
            }
            System.out.print(randomArr[i] + " ");
        }

        System.out.println("\n ----------------");
        System.out.println(" Min value: " + minArrValue);
        System.out.println(" Max value: " + maxArrValue);
        System.out.println(" Count of nulls: " + (randomArr.length - (countOfNegative + countOfPositive)));
        System.out.println(" Count of negative numbers: " + countOfNegative);
        System.out.println(" Count of positive numbers: " + countOfPositive);
    }
}
