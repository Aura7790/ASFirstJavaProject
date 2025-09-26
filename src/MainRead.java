import java.util.List;

public class MainRead {
    public static void main(String[] args) {
        Read read = new Read();
        int userIntNumber = read.getIntNumberFromKeyboard();
        System.out.println("You entered: " + userIntNumber);

        float userFloatNumber = read.getFloatNumberFromKeyboard();
        System.out.println("You entered: " + userFloatNumber);

        double userDoubleNumber = read.getDoubleNumberFromKeyboard();
        System.out.println("You entered: " + userDoubleNumber);

        long userLongNumber = read.getLongNumberFromKeyboard();
        System.out.println("You entered: " + userLongNumber);

        int[] result = read.getArrayFromKeyboard(3); // Example: reads 5 numbers
        System.out.println("You entered: ");
        for (int num : result) {
            System.out.println(num);
        }

        List<Integer> myResult = read.getListFromKeyboard(5); // Example: reads 5 integers
        System.out.println("You entered:");
        for (int num : myResult) {
            System.out.println(num);
        }
    }
}
