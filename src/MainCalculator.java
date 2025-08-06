public class MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // 1. Sum
        int x = 7;
        int y = -31;
        System.out.println("The sum of two int numbers is: " + calc.calculateSumOfTwo(x,y));

        // 2. Substraction
        float a = 17.521F;
        float b = 5.5F;
        System.out.println("The difference between two float numbers is: " + calc.calculateSubstractionOfTwo(a,b));

        // 3. Multiplication
        System.out.println("The multiplication of two int numbers is: " + calc.calculateMultiplicationOfTwo(x,y));

        // 4. Division
        System.out.println("The division of two int numbers is: " + calc.calculateDivisionOfTwo(x,y));
    }
}
