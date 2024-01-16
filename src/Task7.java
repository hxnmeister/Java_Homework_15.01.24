public class Task7 {
    public static void main(String[] args){
        int rangeStart;
        int rangeEnd;

        rangeStart = Helpers.getIntInput(" Enter start of range: ");
        rangeEnd = Helpers.getIntInput(" Enter end of range: ");

        if(rangeStart > rangeEnd){
            int tempInt = rangeStart;
            rangeStart = rangeEnd;
            rangeEnd = tempInt;
        }

        System.out.print("\n Result: ");
        
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
