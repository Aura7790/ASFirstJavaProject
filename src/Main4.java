public class Main4 {
    public static void main(String[] args) {
        // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        String myName = "Aura";
        String greeting = "Hello";
        System.out.println(greeting + "\n" + myName);

        // 2. Printati rezultatul sumei a doua numere(orice numere)
        int firstNumber = 233;
        int secondNumber = 456;
        int sumOfTwoNumbers = firstNumber + secondNumber;
        System.out.println(sumOfTwoNumbers);

        // 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        double x = 22.34;
        int y = 5;
        double divisionOfTwoNumbers = x / y;
        System.out.println(divisionOfTwoNumbers);

        // 4. Printati rezultatul urmatoarelor operatiuni:
        // a. -5 + 8 * 6
        int exerciseA = -5 + 8 * 6;
        System.out.println(exerciseA);

        // b. (55+9) % 9
        int exerciseB = (55+9) % 9;
        System.out.println(exerciseB);

        //c. 20 + -3*5 / 8
        float exerciseC = 20 + (float) (-3 * 5) /8;
        System.out.println(exerciseC);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        int exerciseD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(exerciseD);

    }
}