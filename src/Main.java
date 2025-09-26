import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        LogicalOp op = new LogicalOp();
        Read read = new Read();
        int option;
        String text1 = "FastTrackIT";
        String text2 = "Hello world!";

        do {
            // Display the menu
            System.out.println("\n===== Homework Menu =====");
            System.out.println("\n===== LogicalOperations SubMenu =====");
            System.out.println("1. Greeting print");
            System.out.println("2. Sum two numbers");
            System.out.println("3. Division of two numbers");
            System.out.println("4. Result of -5 + 8 * 6 operation");
            System.out.println("5. Result of (55+9) % 9 operation");
            System.out.println("6. Result of 20 + -3*5 / 8 operation");
            System.out.println("7. Result of 5 + 15 / 3 * 2 - 8 % 3 operation");
            System.out.println("\n===== Calculator =====");
            System.out.println("8. Sum of 3 float numbers");
            System.out.println("9. Substraction of 2 float numbers");
            System.out.println("10. Multiplication of 2 numbers");
            System.out.println("11. Division of 2 float numbers");
            System.out.println("\n===== LogicalOp SubMenu =====");
            System.out.println("12. Lab 9, exercise 3");
            System.out.println("13. Lab 9, exercise 4");
            System.out.println("14. Lab 9, exercise 5");
            System.out.println("15. Lab 9, exercise 6");
            System.out.println("16. Lab 9, exercise 7");
            System.out.println("17. Lab 9, exercise 8");
            System.out.println("18. Lab 9, exercise 9");
            System.out.println("19. Lab 9, exercise 10");
            System.out.println("20. Lab 9, exercise 11");
            System.out.println("21. Lab 10, exercise 1");
            System.out.println("22. Lab 10, exercise 2");
            System.out.println("23. Lab 10, exercise 3");
            System.out.println("24. Lab 10, exercise 4");
            System.out.println("25. Lab 10, exercise 5");
            System.out.println("26. Lab 10, exercise 6");
            System.out.println("27. Lab 10, exercise 7");
            System.out.println("28. Lab 10, exercise 8");
            System.out.println("29. Lab 10, exercise 9");
            System.out.println("30. Lab 10, exercise 10");
            System.out.println("31. Lab 10, exercise 11");
            System.out.println("32. Lab 10, exercise 12");
            System.out.println("33. Lab 10, exercise 13");
            System.out.println("34. Lab 10, exercise 14");
            System.out.println("35. Lab 10, exercise 15");
            System.out.println("36. Lab 10, exercise 16");
            System.out.println("37. Lab 10, exercise 17");
            System.out.println("38. Lab 10, exercise 18");
            System.out.println("39. Lab 10, exercise 19");
            System.out.println("40. Lab 11, exercise 2");
            System.out.println("41. Lab 11, exercise 3");
            System.out.println("42. Lab 11, exercise 4");
            System.out.println("43. Lab 11, exercise 5");
            System.out.println("44. Lab 11, exercise 6");
            System.out.println("45. Lab 11, exercise 7");
            System.out.println("46. Lab 11, exercise 8");
            System.out.println("47. Lab 11, exercise 9");
            System.out.println("48. Lab 11, exercise 10");
            System.out.println("49. Lab 11 - Tema optionala - Java Arrays, ex 1");
            System.out.println("50. Lab 11 - Tema optionala - Java Arrays, ex 2");
            System.out.println("51. Lab 11 - Tema optionala - Java Arrays, ex 3");
            System.out.println("52. Lab 11 - Tema optionala - Java Arrays, ex 4");
            System.out.println("53. Lab 11 - Tema optionala - Java Arrays, ex 5");
            System.out.println("54. Lab 11 - Tema optionala - Java Arrays, ex 6");
            System.out.println("55. Lab 12 - exercise 1");
            System.out.println("56. Lab 12 - exercise 2");
            System.out.println("57. Lab 12 - exercise 3");
            System.out.println("58. Lab 12 - exercise 4");
            System.out.println("59. Lab 12 - exercise 5");
            System.out.println("60. Lab 12 - exercise 6");
            System.out.println("61. Lab 12 - exercise 7");
            System.out.println("62. Lab 12 - exercise 8");
            System.out.println("63. Lab 12 - Tema optionala Lists - 1");
            System.out.println("64. Lab 12 - Tema optionala Lists - 2");
            System.out.println("65. Lab 12 - Tema optionala Lists - 3");
            System.out.println("66. Lab 12.5 - Tema - Try-Catch - Ex 5");
            System.out.println("67. Lab 12.5 - Tema - Try-Catch - Ex 6");
            System.out.println("0. Exit");
            System.out.print("Hello! Choose an option: ");

            try {
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.println(LogicalOperations.printMyGreeting("Hello", "Test"));
                        break;
                    case 2:
                        System.out.println("Sum of 2 numbers is: " + LogicalOperations.sumOfTwo(7, 12));
                        break;
                    case 3:
                        System.out.println("Division between 2 numbers is: " + LogicalOperations.divisionOfTwo(77, 22));
                        break;
                    case 4:
                        System.out.println("Result of -5 + 8 * 6 operation is: " + LogicalOperations.doOperationA(-5, 8, 6));
                        break;
                    case 5:
                        System.out.println("Result of (55+9) % 9 operation is: " + LogicalOperations.doOperationB(55, 9));
                        break;
                    case 6:
                        System.out.println("Result of 20 + -3*5 / 8 operation is: " + LogicalOperations.doOperationC(20, 3, 5, 8));
                        break;
                    case 7:
                        System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3 operation: " + LogicalOperations.doOperationD(5, 15, 3, 2, 8, 3));
                        break;
                    case 8:
                        System.out.println("Sum of 3 float numbers: " + calc.calculateSum(11.22f, 22.4f, 3.14));
                        break;
                    case 9:
                        System.out.println("Substraction of 2 float numbers: " + calc.calculateSubstraction(5.5f, 22.3));
                        break;
                    case 10:
                        System.out.println("Multiplication of 2 numbers: " + calc.calculateMultiplication(12, 33));
                        break;
                    case 11:
                        System.out.println("Division of 2 float numbers: " + calc.calculateDivision(12.2f, 67.8f));
                        break;
                    case 12:
                        System.out.println("The biggest number between 2 given int numbers is: " + op.checkBiggerNumber(17, 77));
                        break;
                    case 13:
                        System.out.println("Workshop text is: " + op.checkWorkshopText(text1));
                        System.out.println("My text is: " + op.checkWorkshopText(text2));
                        break;
                    case 14:
                        System.out.println(op.checkWorkshopText2("FastTrackIT", 3));
                        System.out.println(op.checkWorkshopText2("Hello", 4));
                        System.out.println(op.checkWorkshopText2("FastTrackIT", 44));
                        System.out.println(op.checkWorkshopText2("FastTrackIT", 4));
                        break;
                    case 15:
                        System.out.println(op.checkSnowInWinter(6));
                        System.out.println(op.checkSnowInWinter(10));
                        System.out.println(op.checkSnowInWinter(8));
                        System.out.println(op.checkSnowInWinter(3));
                        break;
                    case 16:
                        System.out.println(op.checkNumberComparison(7));
                        System.out.println(op.checkNumberComparison(4));
                        System.out.println(op.checkNumberComparison(2));
                        break;
                    case 17:
                        System.out.println(op.checkNumberSwitch(1));
                        System.out.println(op.checkNumberSwitch(5));
                        System.out.println(op.checkNumberSwitch(7));
                        break;
                    case 18:
                        System.out.println(op.isNumberEven(5));
                        System.out.println(op.isNumberEven(10));
                        break;
                    case 19:
                        System.out.println(op.isEligibleToVote(18));
                        System.out.println(op.isEligibleToVote(10));
                        System.out.println(op.isEligibleToVote(22));
                        break;
                    case 20:
                        System.out.println(op.checkHighestNumber(7, 11, 99));
                        System.out.println(op.checkHighestNumber(22, 13, -5));
                        System.out.println(op.checkHighestNumber(11, 11, 11));
                        break;
                    case 21:
                        op.printFromNumberPositive(90);
                        break;
                    case 22:
                        op.printFromNumberNegative(-90);
                        break;
                    case 23:
                        op.printCountBetweenTwoNumbers(7, 2);
                        break;
                    case 24:
                        op.printCountBetween(5, -1);
                        break;
                    case 25:
                        op.printEvenNumbers();
                        break;
                    case 26:
                        op.printOddNumbers();
                        break;
                    case 27:
                        System.out.println(op.printSumOfNumbers(76));
                        break;
                    case 28:
                        System.out.println(op.printAverageOfNumbers(10));
                        break;
                    case 29:
                        op.printStars(5);
                        break;
                    case 30:
                        op.printFromNumberTo100(95);
                        break;
                    case 31:
                        op.printNumbersToMinus100(-90);
                        break;
                    case 32:
                        op.printCountBetweenTwoNumbers2(7, 20);
                        break;
                    case 33:
                        op.printCountBetweenTwoNumbers3(9, 2);
                        break;
                    case 34:
                        op.printEvenNumbers2();
                        break;
                    case 35:
                        op.printOddNumbers2();
                        break;
                    case 36:
                        op.printAvgFromNumberToNumber(111, 8899);
                        break;
                    case 37:
                        System.out.println(op.printAvgNumbersFromInterval(7, 27));
                        break;
                    case 38:
                        op.printFibonacciNumbers(20);
                        break;
                    case 39:
                        op.printCozaLozaWoza();
                        break;
                    case 40:
                        op.getArrayTo100();
                        break;
                    case 41:
                        int[] evens = new int[50];    // only 50 numbers are even
                        op.getEvenArrayTo100(evens);
                        int i = 0;
                        while(i < evens.length){
                            System.out.print(evens[i] + " ");
                            i++;
                        }
                        break;
                    case 42:
                        int[] myArray = {15, 17, 22, 1, 44};
                        float avg = op.getAverageMyArray(myArray);
                        System.out.println();
                        System.out.println(avg);
                        break;
                    case 43:
                        String[] myStringArr = {"map", "car", "Flower", "cat", "Book"};
                        boolean result1 = op.getMyStringArray(myStringArr, "cat");
                        System.out.println(result1);
                        System.out.println(op.getMyStringArray(myStringArr, "morning"));
                        break;
                    case 44:
                        int[] myArrayOfInts = new int [100];
                        int index = op.getNumberPositionInArray(myArrayOfInts, 101);
                        System.out.println(index);
                        break;
                    case 45:
                        op.printLinesPattern();
                        break;
                    case 46:
                        int[] numbers = {7, 27, 37, 47, 57, 67, 17};
                        int numberToRemove = 7;
                        int[] result = op.deleteNumberFromArray(numbers, numberToRemove);
                        System.out.println(Arrays.toString(result));
                        break;
                    case 47:
                        int[] numbers2 = {7, 27, 37, 47, 57, 67, 17};
                        int[] myResult = op.getSecondSmallesNumber(numbers2);
                        System.out.println(Arrays.toString(myResult));
                        break;
                    case 48:
                        int[] arr1 = {9, 19, 29, 59, 39, 49, 9, 22, 0, 30};
                        int[] arr2 = new int[10];
                        System.out.println(Arrays.toString(op.copyArrayFromOneToAnother(arr1, arr2)));
                        break;
                    case 49:
                        int[] arr3 = {1, 2, 3 ,4, 5, 6, 7, 8};
                        int element = 77;
                        int position = 0;
                        numbers = op.insertOnPositionInArray(arr3, element, position);
                        for (int n = 0; n < numbers.length; n++){
                            System.out.print(numbers[n] + " ");
                        }
                        break;
                    case 50:
                        int[] numbers3 = {11, 22, 44, 3, 17, 99};
                        int[] minMax = op.getMinMax(numbers3);
                        System.out.println();
                        System.out.println("Min number:" + minMax[0]);
                        System.out.println("Max number:" + minMax[1]);
                        break;
                    case 51:
                        int[] numbers4 = {17, 22, 44, 3, 19, 99, 100, 110, 7, 100, 17};
                        op.invertValuesInArray(numbers4);
                        // Print inverted array
                        for (int j = 0; j < numbers4.length; j++){
                            System.out.print(numbers4[j] + " ");
                        }
                        break;
                    case 52:
                        int[] numbers5 = {11, 22, 44, 3, 17, 99};
                        System.out.println();
                        op.findDuplicates(numbers5);
                        break;
                    case 53:
                        String[] array1 = {"apple", "pear", "banana", "plum", "cat"};
                        String[] array2 = {"cat", "dog", "elephant", "bear", "apple"};
                        op.findCommonElements(array1, array2);
                        break;
                    case 54:
                        int[] numArray = {2, -7, 100, 97, 77, 101, -5, 20, 5, 3, 0};
                        int[] sortedNumbers = op.sortMyArray(numArray);
                        // Print sorted array
                        for (int p = 0; p < sortedNumbers.length; p++){
                            System.out.print(sortedNumbers[p] + " ");
                        }
                        break;
                    case 55:
                        List<Integer> listMyList = new ArrayList<>();
                        listMyList.add(7);
                        listMyList.add(17);
                        listMyList.add(0);
                        System.out.println();
                        op.printParamsFromList(listMyList);
                        break;
                    case 56:
                        List<Integer> listA = new ArrayList<>();
                        listA.add(5);
                        listA.add(15);
                        listA.add(151);
                        op.addNumberToList(listA, 22);
                        break;
                    case 57:
                        List<Integer> newList = Arrays.asList(5, 8, 10, 12, 15, 18, 21, 17, 2, 3);
                        op.printMyList(newList, 8);
                        op.printMyList(newList, 99);
                        break;
                    case 58:
                        List<Integer> listB = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                        op.printReversedList(listB);
                        break;
                    case 59:
                        List<String> listS = new ArrayList<>();
                        listS.add("cat");
                        listS.add("dog");
                        listS.add("map");
                        listS.add("clone");
                        System.out.println();
                        op.addStringToList(listS, 9, "apple");
                        op.addStringToList(listS, 4, "apple");
                        break;
                    case 60:
                        List<String> listSe = new ArrayList<>(Arrays.asList("cat", "dog", "map", "clone"));
                        System.out.println(op.getMyList(listSe, "mango"));
                        break;
                    case 61:
                        List<String> listAnimals = new ArrayList<>(Arrays.asList("cat", "dog", "zebra", "wolf", "elephant"));
                        op.printMyList(listAnimals);
                        break;
                    case 62:
                        List<Integer> myNumbers = Arrays.asList(10, 17, 101, 19, 7, 209);
                        System.out.println(op.getMax(myNumbers));
                        break;
                    case 63:
                        List<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Banana", "Orange", "Pear", "Apple", "Lemon"));
                        op.swapElements(fruits, 0, 4);
                        break;
                    case 64:
                        List<Integer> numbers7 = Arrays.asList(2, 17, 22, 10, 19, 13, 3, 55, 404, 100);
                        List<Integer> myEvens = op.getEvenNumbers(numbers7);
                        System.out.println(myEvens);
                        break;
                    case 65:
                        List<Integer> numbers8 = Arrays.asList(2, 17, 22, 10, 19, 13, 3, 55, 404, 100);
                        List<Integer> mySortedList = op.getSortedList(numbers8);
                        System.out.println(mySortedList);
                        break;
                    case 66:
                        int[] arrayOfNumbers = {11, 22, 33, 44, 55, 66, 77};
                        op.printNumberAtIndex(arrayOfNumbers, 2);
                        op.printNumberAtIndex(arrayOfNumbers, 8);
                        break;
                    case 67:
                        op.waitInSeconds(5);
                        break;
                    case 0:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                option = -1; // Ensures the loop continues
            }

        } while (option != 0); // Keep showing the menu until the user chooses 0

        scanner.close();
    }
}
