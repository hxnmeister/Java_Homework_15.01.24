public class Task6 {
    public static void main(String[] args){
        int meters;
        int choice;
        double oneMile = 0.000621371;
        double oneInch = 39.37;
        double oneYard = 1.09361;

        meters = Helpers.getIntInput(" Enter meters: ");

        System.out.println("\n Convert to:");
        System.out.println("  1. miles");
        System.out.println("  2. inches");
        System.out.println("  3. yards");

        choice = Helpers.getIntRangeInput("\n Enter field: ", 1, 3);

        System.out.print("\n Result: ");

        switch (choice){
            case 1:
                System.out.printf("%.3f miles", meters * oneMile);
                break;
            case 2:
                System.out.printf("%.3f inches", meters * oneInch);
                break;
            case 3:
                System.out.printf("%.3f yards", meters * oneYard);
                break;
        }
    }
}
