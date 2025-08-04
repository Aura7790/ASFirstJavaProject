public class Main2 {
    public static void main(String[] args) {
        // LogicalOperations operation = new LogicalOperations();

        // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        String greeting = "Hello";
        String myName = "Aura";
        System.out.println(LogicalOperations.myGreeting(greeting, myName));

        // 2. Printati rezultatul sumei a doua numere(orice numere)
        int firstNumber = 233;
        int secondNumber = 456;
        System.out.println(LogicalOperations.sumOfTwo(firstNumber, secondNumber));

        // 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        double x = 22.34;
        int y = 5;
        System.out.println(LogicalOperations.divisionOfTwo(x, y));

        // 4. Printati rezultatul urmatoarelor operatiuni:
        // a. -5 + 8 * 6
        int a = -5;
        int b = 8;
        int c = 6;
        System.out.println(LogicalOperations.operationA(a, b, c));

        // b. (55+9) % 9
        int d = 55;
        int e = 9;
        System.out.println(LogicalOperations.operationB(d, e));

        //c. 20 + -3*5 / 8
        int f = 20;
        int g = -3;
        System.out.println(LogicalOperations.operationC(f, g, y, b));

        //d. 5 + 15 / 3 * 2 - 8 % 3
        int i = 15;
        int j = 3;
        int k = 2;
        System.out.println(LogicalOperations.operationD(y, i, j, k, b, j));
    }
}
