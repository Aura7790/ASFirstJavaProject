import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    private static Scanner scanner = new Scanner(System.in);

    public int getIntNumberFromKeyboard() {
        System.out.print("Enter an integer number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next(); // discard invalid input
        }

        int number = scanner.nextInt();
        return number;
    }

    public float getFloatNumberFromKeyboard() {
        System.out.print("Enter a float number: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Invalid input. Please enter a float: ");
            scanner.next(); // discard invalid input
        }

        float number = scanner.nextFloat();
        return number;
    }

    public double getDoubleNumberFromKeyboard() {
        System.out.print("Enter a double number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a double: ");
            scanner.next(); // discard invalid input
        }

        double number = scanner.nextDouble();
        return number;
    }

    public long getLongNumberFromKeyboard() {
        System.out.print("Enter a long number: ");
        while (!scanner.hasNextLong()) {
            System.out.print("Invalid input. Please enter a long: ");
            scanner.next(); // discard invalid input
        }

        long number = scanner.nextLong();
        return number;
    }

    public int[] getArrayFromKeyboard(int size){
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = getIntNumberFromKeyboard(); // using the method created above
        }
        return numbers;
    }

    public static List<Integer> getListFromKeyboard(int size) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + size + " integer numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            try {
                int number = scanner.nextInt();
                numbers.add(number);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                System.exit(1); // Exit with error code
            }
        }
        return numbers;
    }
}
