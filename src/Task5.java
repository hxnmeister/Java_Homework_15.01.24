public class Task5 {
    public static void main(String[] args){
        int month;
        int minValue = 1;
        int maxValue = 12;
        String currentSeason = "";

        month = Helpers.getIntInput(" Enter month by number: ", minValue, maxValue);

        currentSeason = switch (month) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> null;
        };

        System.out.println("\n Current season: " + currentSeason);
    }
}
