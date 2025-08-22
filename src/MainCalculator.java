public class MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // 1. Sum
        int x = 7;
        int y = -31;
        System.out.println("The sum of two int numbers is: " + calc.calculateSum(x,y));
        System.out.println("The sum of three double numbers is: " + calc.calculateSum(2.2, 3.4566, 6.55));
        System.out.println("The sum of two float numbers is: " + calc.calculateSum(2.2f, 6.55f));

        // 2. Substraction
        float a = 17.521F;
        float b = 5.5F;
        System.out.println("The difference between 4 int numbers is: " + calc.calculateSubstraction(7, 9, 66, 8 ));
        System.out.println("The difference between two float numbers is: " + calc.calculateSubstraction(a,b));
        System.out.println("The difference between two double numbers is: " + calc.calculateSubstraction(-4.56322, 7.899));

        // 3. Multiplication
        System.out.println("The multiplication of two int numbers is: " + calc.calculateMultiplication(x,y));
        System.out.println("The multiplication of 4 float numbers is: " + calc.calculateMultiplication(1.1f, 4.55f, 7.12f, 3.14f));
        System.out.println("The multiplication of two double numbers is: " + calc.calculateMultiplication(7.77777, 98.552453));

        // 4. Division
        System.out.println("The division of 2 float numbers is: " + calc.calculateDivision(7.1f, 5.5555f));
        System.out.println("The division of 3 int numbers is: " + calc.calculateDivision(7, -3, 9));
        System.out.println("The division of two double numbers is: " + calc.calculateDivision(7.77777779, 54.3333));
    }
}
