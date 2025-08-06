public class Main3 {
    public static void main(String[] args) {
        // 1. Sum
        int x = 7;
        int y = -31;
        System.out.println("The sum of two int numbers is: " + Operations.sumOfTwo(x,y));

        // 2. Substraction
        float a = 17.521F;
        float b = 5.5F;
        System.out.println("The difference between two float numbers is: " + Operations.substractionOfTwo(a,b));

        // 3. Multiplication
        System.out.println("The multiplication of two int numbers is: " + Operations.multiplicationOfTwo(x,y));

        // 4. Division
        System.out.println("The division of two int numbers is: " + Operations.divisionOfTwo(x,y));

        // Scrieti o metoda java, care sa afiseze urmatorul model: "Java" string on different lines
        String row1 = "   J    a    v    v    a";
        String row2 = "   J   a a    v  v    a a";
        String row3 = "J  J  aaaaa    V V   aaaaa";
        String row4 = " JJ   a   a     V    a   a";
        System.out.println(Operations.printPattern(row1, row2, row3, row4));

        // Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
        int i = -1;
        int j = 7;
        int k = 14;
        System.out.println("The average of 3 int numbers is: " + Operations.averageOfThree(i, j, k));

        // Scrieti o metoda java, care sa afiseze urmatorul model: a face
        String line1 = " +\"\"\"\"\"+ ";
        String line2 = "[| o o |]";
        String line3 = " |  ^  | ";
        String line4 = " | '-' | ";
        String line5 = " +-----+ ";
        System.out.println(Operations.printRobotFace(line1, line2, line3, line4, line5));

        // Scrieti o metoda java, care sa returneze restul impartirii a doua numere
        int firstNumber = 10;
        int secondNumber = 6;
        System.out.println("The mod of 2 int numbers is: " + Operations.modOfTwo(firstNumber, secondNumber));

        // Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
        double fahrenheitTemp = 15.0;
        double celsiusTemp = Operations.fahrenheitToCelsius(fahrenheitTemp);
        System.out.println(fahrenheitTemp + " Fahrenheit is equal to " + celsiusTemp + " Celsius");

        // Scrieti o metoda java, care sa primeasca ca si parametru un numar real,care sa reprezinte distanta in inch, si sa returneze distanta in metri.
        double inchValue = 101.2;
        double metersValue = Operations.inchToMeters(inchValue);
        System.out.println(inchValue + " inches represent " + metersValue + " meters");

        // Scrieti o metoda java, care primeste distanta (in metri) si timpul (ca si 3 numere: ore, minute, secunde),
        // si afiseaza viteza, in metri pe secunda, kilometrii pe ora si mile pe ora.
        Operations.calculateSpeed(505, 2, 17, 9);
    }
}
