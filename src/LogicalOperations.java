
public class LogicalOperations {
    // Rezolvare exercitii Lab 7 dar cu metode
    // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static String printMyGreeting(String greeting, String myName){
        return greeting + "\n" + myName;
    }

    // 2. Printati rezultatul sumei a doua numere(orice numere)
    public static int sumOfTwo(int first, int second) {
        return first + second;
    }

    // 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    public static double divisionOfTwo(double first, int second){
        return first / second;
    }

    // 4. Printati rezultatul urmatoarelor operatiuni:
    // a. -5 + 8 * 6
    public static int doOperationA(int first, int second, int third){
        return first + second * third;
    }
    // b. (55+9) % 9
    public static int doOperationB(int first, int second) {
        return (first + second) % second;
    }

    //c. 20 + -3*5 / 8
    public static float doOperationC(int first, int second, int third, int fourth) {
        return first + (float) (second * third) / fourth;
    }

    //d. 5 + 15 / 3 * 2 - 8 % 3
    public static int doOperationD(int j, int k, int l, int m, int n, int o) {
        return j + k / l * m - n % o;
    }
}