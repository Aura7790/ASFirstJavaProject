public class Operations {
    // 2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public static int sumOfTwo(int first, int second){
        int result;
        result = first + second;
        return result;
    }

    public static float substractionOfTwo(float first, float second){
        float result;
        result = first - second;
        return result;
    }

    public static float multiplicationOfTwo(int first, int second) {
        float result;
        result = first * second;
        return result;
    }

    public static float divisionOfTwo(int first, int second) {
        float result;
        result = (float) first / second;
        return result;
    }

    // 3. Scrieti o metoda java, care sa afiseze urmatorul model: "Java" string on different lines
    public static String myPattern (String firstRow, String secondRow, String thirdRow, String fourthRow){
        String result = firstRow + "\n" + secondRow + "\n" + thirdRow + "\n" + fourthRow;
        return result;
    }

    // 4.Scrieti o metoda java, care sa primeasca 3 parametri de tip numar, si sa returneze media numerelor.
    public static int averageOfThree(int firstNumber, int secondNumber, int thirdNumber){
        return (firstNumber + secondNumber + thirdNumber) / 3;
    }

    // 5. Scrieti o metoda java, care sa afiseze urmatorul model: a face
    public static String robotFace(String firstLine, String secondLine, String thirdLine, String fourthLine, String fifthLine){
        return firstLine + "\n" + secondLine + "\n" + thirdLine + "\n" + fourthLine + "\n" + fifthLine;
    }

    // 6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public static int modOfTwo(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }

    // 7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.
    // Formula de calcul este: C = 5/9 * (F -32)
    public static double fahrenheitToCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // 8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,care sa reprezinte distanta in inch, si sa returneze distanta in metri.
    public static double inchToMeters(double inch) {
        return inch * 0.0254;
    }

    // 9. Scrieti o metoda java, care primeste distanta (in metri) si timpul (ca si 3 numere: ore, minute, secunde),
    // si afiseaza viteza, in metri pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metri)
    public static void speedCalculator(double distanceMeters, int hours, int minutes, int seconds) {
        // Calculeaza timpul total in secunde
        double totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        // Calculeaza viteza in metri pe secunda
        double speedMetersPerSecond = distanceMeters / totalTimeInSeconds;
        // Calculeaza viteza in kilometri pe ora
        double speedKmPerHour = speedMetersPerSecond * 3.6;
        // Calculeaza viteza in mile pe ora
        double speedMilesPerHour = speedMetersPerSecond * 2.23694;

        // Afiseaza rezultatele
        System.out.println("The speed in m/s: " + speedMetersPerSecond);
        System.out.println("The speed in km/h: " + speedKmPerHour);
        System.out.println("The speed in mph: " + speedMilesPerHour);
    }
}
