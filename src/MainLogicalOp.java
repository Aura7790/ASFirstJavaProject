import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainLogicalOp {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        // Lab 9, exercitiul 3
        int biggest = op.checkBiggerNumber(11,99);
        System.out.println("The bigger number is: " + biggest);

        // Lab 9, exercitiul 4
        String text1 = "FastTrackIT";
        String text2 = "Hello world!";
        System.out.println(op.checkWorkshopText(text1));
        System.out.println(op.checkWorkshopText(text2));

        // Lab 9, exercitiul 5
        String text3 = "FastTrackIT";
        int number1 = 3;
        System.out.println(op.checkWorkshopText2(text3, number1));
        String text4 = "Hello";
        int number2 = 4;
        System.out.println(op.checkWorkshopText2(text4, number2));
        String text5 = "FastTrackIT";
        int number3 = 14;
        System.out.println(op.checkWorkshopText2(text5, number3));
        String text6 = "FastTrackIT";
        int number4 = 4;
        System.out.println(op.checkWorkshopText2(text6, number4));

        // Lab 9, exercitiul 6
        String snow1 = op.checkSnowInWinter(6);
        System.out.println(snow1);
        String snow2 = op.checkSnowInWinter(10);
        System.out.println(snow2);
        String snow3 = op.checkSnowInWinter(8);
        System.out.println(snow3);
        String snow4 = op.checkSnowInWinter(3);
        System.out.println(snow4);

        // Lab 9, exercitiul 7
        String num1 = op.checkNumberComparison(7);
        System.out.println(num1);
        String num2 = op.checkNumberComparison(4);
        System.out.println(num2);
        String num3 = op.checkNumberComparison(2);
        System.out.println(num3);

        // Lab 9, exercitiul 8
        System.out.println(op.checkNumberSwitch(1));
        System.out.println(op.checkNumberSwitch(5));
        System.out.println(op.checkNumberSwitch(7));

        // Lab 9, exercitiul 9
        System.out.println(op.isNumberEven(5));
        System.out.println(op.isNumberEven(10));

        // Lab 9, exercitiul 10
        System.out.println(op.isEligibleToVote(18));
        System.out.println(op.isEligibleToVote(10));
        System.out.println(op.isEligibleToVote(22));

        // Lab 9, exercitiul 11
        System.out.println(op.checkHighestNumber(7, 11, 99));
        System.out.println(op.checkHighestNumber(22, 13, -5));
        System.out.println(op.checkHighestNumber(11, 11, 11));

        // Java FOR Loops
        // Lab 10, ex 1
        int x = 90;
        op.printFromNumberPositive(x);

        // Lab 10, ex 2
        int y = -90;
        op.printFromNumberNegative(-y);

        // Lab 10, ex 3
        int z = 7;
        int w = 2;
        op.printCountBetweenTwoNumbers(z, w);

        // Lab 10, ex 4
        op.printCountBetween(5, -1);

        // Lab 10, ex 5
        op.printEvenNumbers();

        // Lab 10, ex 6
        op.printOddNumbers();

        // Lab 10, ex 7
        int a = 76;
        System.out.println(op.printSumOfNumbers(a));

        // Lab 10, ex 8
        int b = 10;
        System.out.println(op.printAverageOfNumbers(b));

        // Lab 10, ex 9
        op.printStars(5);


        // Java While Loops
        // Lab 10, ex1
        op.printFromNumberTo100(95);

        // Lab 10, ex2
        op.printNumbersToMinus100(-90);

        // Lab 10, ex3
        op.printCountBetweenTwoNumbers2(7, 20);

        // Lab 10, ex4
        op.printCountBetweenTwoNumbers3(9, 2);

        //Lab 10, ex 5
        op.printEvenNumbers2();

        // Lab 10, ex 6
        op.printOddNumbers2();

        // Lab 10, ex 7
        op.printAvgFromNumberToNumber(111, 8899);

        // Lab 10, ex 8
        System.out.println(op.printAvgNumbersFromInterval(7, 27));

        // Lab 10, ex 9
        op.printFibonacciNumbers(20);

        // Lab 10, ex 10
        op.printCozaLozaWoza();

        // Lab 11 (Java Arrays), ex 2
        op.getArrayTo100();

        // Lab 11 (Java Arrays), ex 3
        int[] evens = new int[50];    // only 50 numbers are even
        op.getEvenArrayTo100(evens);
        int i = 0;
        while(i < evens.length){
            System.out.print(evens[i] + " ");
            i++;
        }

        // Lab 11 (Java Arrays), ex 4
        int[] myArray = {15, 17, 22, 1, 44};
        float avg = op.getAverageMyArray(myArray);
        System.out.println();
        System.out.println(avg);

        // Lab 11 (Java Arrays), ex 5
        String[] myStringArr = {"map", "car", "Flower", "cat", "Book"};
        boolean result1 = op.getMyStringArray(myStringArr, "cat");
        System.out.println(result1);
        System.out.println(op.getMyStringArray(myStringArr, "morning"));

        // Lab 11 (Java Arrays), ex 6
        int[] myArrayOfInts = new int [100];
        int index = op.getNumberPositionInArray(myArrayOfInts, 101);
        System.out.println(index);

        // Lab 11 (Java Arrays), ex 7
        op.getLinesPattern();

        // Lab 11 (Java Arrays), ex 8
        int[] numbers = {7, 27, 37, 47, 57, 67, 17};
        int numberToRemove = 7;
        int[] result = op.deleteNumberFromArray(numbers, numberToRemove);
        System.out.println(Arrays.toString(result));

        // Lab 11 (Java Arrays), ex 9
        int[] myResult = op.getSecondSmallesNumber(numbers);
        System.out.println(Arrays.toString(myResult));

        // Lab 11 (Java Arrays), ex 10
        int[] arr1 = {9, 19, 29, 59, 39, 49, 9, 22, 0, 30};
        int[] arr2 = new int[10];
        System.out.println(Arrays.toString(op.copyArrayFromOneToAnother(arr1, arr2)));

        // Lab 11 - Tema optionala - Java Arrays, ex 1
        int[] arr3 = {1, 2, 3 ,4, 5, 6, 7, 8};
        int element = 77;
        int position = 0;
        numbers = op.insertOnPositionInArray(arr3, element, position);
        for (int n = 0; n < numbers.length; n++){
            System.out.print(numbers[n] + " ");
        }

        // Lab 11 - Tema optionala - Java Arrays, ex 2
        int[] numbers2 = {11, 22, 44, 3, 17, 99};
        int[] minMax = op.getMinMax(numbers2);
        System.out.println();
        System.out.println("Min number:" + minMax[0]);
        System.out.println("Max number:" + minMax[1]);

        // Lab 11 - Tema optionala - Java Arrays, ex 3
        int[] numbers3 = {17, 22, 44, 3, 19, 99, 100, 110, 7, 100, 17};
        op.invertValuesInArray(numbers3);
        // Print inverted array
        for (int j = 0; j < numbers3.length; j++){
            System.out.print(numbers3[j] + " ");
        }

        // Lab 11 - Tema optionala - Java Arrays, ex 4
        System.out.println();
        op.findDuplicates(numbers3);

        // Lab 11 - Tema optionala - Java Arrays, ex 5
        String[] array1 = {"apple", "pear", "banana", "plum", "cat"};
        String[] array2 = {"cat", "dog", "elephant", "bear", "apple"};
        op.findCommonElements(array1, array2);

        // Lab 11 - Tema optionala - Java Arrays, ex 6
        int[] numArray = {2, -7, 100, 97, 77, 101, -5, 20, 5, 3, 0};
        int[] sortedNumbers = op.sortMyArray(numArray);
        // Print sorted array
        for (int p = 0; p < sortedNumbers.length; p++){
            System.out.print(sortedNumbers[p] + " ");
        }

        // Lab 12 - Lists
        // 1. Scrieti o metoda Java, care sa primeasca parametru o Lista,
        // si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

        List<Integer> listMyList = new ArrayList<>();
        listMyList.add(7);
        listMyList.add(17);
        listMyList.add(0);
        System.out.println();
        op.printParamsFromList(listMyList);

        // 2. Scrieti o metoda Java, care sa primeasca doi parametri: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
        // Metoda sa adauge numarul primit ca si parametru la final de lista.
        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(15);
        listA.add(151);
        op.addNumberToList(listA, 22);

        // 3. Scrieti o metoda Java, care sa primeasca doi parametri: un parametru de tip Lista, iar celalalt un numar intreg.
        // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul
        // intreg primit ca si parametru.
        List<Integer> newList = Arrays.asList(5, 8, 10, 12, 15, 18, 21, 17, 2, 3);
        op.printMyList(newList, 8);
        op.printMyList(newList, 99);

        // 4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
        // dar invers(de la capat la inceput).

        List<Integer> listB = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        op.printReversedList(listB);

        // 5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
        // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg
        // reprezinta pozitia la care sa fie pus acel String.
        List<String> listS = new ArrayList<>();
        listS.add("cat");
        listS.add("dog");
        listS.add("map");
        listS.add("clone");
        System.out.println();
        // System.out.println(listS + "\n");
        op.printStringList(listS, 9, "apple");
        op.printStringList(listS, 4, "apple");

        // 6. Scrieti o metoda Java, care sa primeasca doi parametri.
        // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
        System.out.println(op.getMyList(listS, "mango"));

        // 7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.
        // (Ex: “Pe pozitia 1 valoare este 4”).
        op.printMyList(listS);

        // 8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
        List<Integer> myNumbers = Arrays.asList(10, 17, 101, 19, 7, 209);
        System.out.println(op.getMax(myNumbers));
    }
}
