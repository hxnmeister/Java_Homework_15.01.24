public class Task8 {
    public static void main(String[] args) {
        int rangeStart;
        int rangeEnd;

        rangeStart = Helpers.getIntInput(" Enter start of range: ");
        rangeEnd = Helpers.getIntInput(" Enter end of range: ");

        if(rangeStart > rangeEnd){
            int tempInt = rangeStart;
            rangeStart = rangeEnd;
            rangeEnd = tempInt;
        }

        for (int i = rangeStart; i <= rangeEnd; i++) {
            if(i == 0){
                continue;
            }

            for (int j = 1; j < 11; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("-----------");
        }
    }
}
