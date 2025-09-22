import java.util.ArrayList;
import java.util.List;

public class LogicalOp {
    // Lab 9, exercitiul 3
    public int checkBiggerNumber(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    // Lab 9, exercitiul 4
    public String checkWorkshopText(String myText) {
        String defaultText = "FastTrackIT";
        if (myText.equals(defaultText)) {
            return("Learning text comparison!");
        }
        else {
            return("Got to try some more!");
        }
    }

    // Lab 9, exercitiul 5
    public String checkWorkshopText2(String textInput, int numberInput){
        String defaultText = "FastTrackIT";
        if (textInput.equals(defaultText) && numberInput <= 3) {
            return textInput + numberInput;
        }
        else if (!textInput.equals(defaultText) && numberInput >= 4) {
            return numberInput + textInput;
        }
        return "No condition was met";
    }

    // Lab 9, exercitiul 6
    public String checkSnowInWinter(int numberInput){
        if (numberInput > 8 || numberInput == 6) {
            return "The amount of snow this winter was(cm): " + numberInput;
        }
        else {
            return "The forecast snow is(cm):" + numberInput;
        }
    }

    // Lab 9, exercitiul 7
    public String checkNumberComparison(int numberInput){
        if (numberInput > 3 && numberInput != 4) {
            return "The number is greater than 3 and not equal to 4";
        }
        else if (numberInput == 4) {
            return "The number is equal to 4";
        }
        else if (numberInput < 3){
            return "The number is lower than 3";
        }
        else {
            return "Your input is not matching";
        }
    }

    // Lab 9, exercitiul 8
    public String checkNumberSwitch(int numberInput){
        return switch (numberInput) {
            case 1 -> "The number is:  1 !";
            case 2 -> "The number is:  2 !";
            case 3 -> "The number is:  3 !";
            case 4 -> "The number is:  4 !";
            case 5 -> "The number is:  5 !";
            default -> "Invalid input!";
        };
    }

    // Lab 9, exercitiul 9
    public  boolean isNumberEven (int numberInput){
        if (numberInput % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // Lab 9, exercitiul 10
    public boolean isEligibleToVote(int ageInput){
        if (ageInput >= 18) {
            System.out.println("You are eligible to vote!");
            return true;
        }
        else {
            System.out.println("You are not eligible to vote!");
            return false;
        }
    }

    // Lab 9, exercitiul 11
    public String checkHighestNumber(int firstInput, int secondInput, int thirdInput){
        if (firstInput > secondInput && firstInput > thirdInput){
            return "Highest number is :" + firstInput;
        }
        else if (secondInput > firstInput && secondInput > thirdInput) {
            return "Highest number is :" + secondInput;
        }
        else if (thirdInput> firstInput && thirdInput > secondInput){
            return "Highest number is :" + thirdInput;
        }
        return "All numbers are equal. Please provide other inputs!";
    }
    // Java FOR Loops
    // Lab 10, ex 1
    public void printFromNumberPositive(int number){
        for(int i=number; i<=100; i++){
            System.out.println(i);
        }
    }

    // Lab 10, ex 2
    public void printFromNumberNegative(int number){
        for(int i=number; i>=-100; i--){
            System.out.println(i);
        }
    }

    // Lab 10, ex 3
    public void printCountBetweenTwoNumbers(int x, int y){
        if (x < y){
            for(int i=x; i<=y; i++){
                System.out.println(i);
            }
        }
        else if (x > y) {
            for(int i=x; i>=y; i--){
                System.out.println(i);
            }
        }
        else {
            System.out.println("The provided numbers are equal!");
        }
    }

    // Lab 10, ex 4
    public void printCountBetween(int x, int y){
        int minNumber = Math.min(x, y);
        int maxNumber = Math.max(x, y);
        for(int i=minNumber; i<=maxNumber; i++) {
            System.out.println(i);
        }
    }

    // Lab 10, ex 5
    public void printEvenNumbers(){
        for(int i=0; i<=100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    // Lab 10, ex 6
    public void printOddNumbers(){
        for(int i=0; i<=100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    // Lab 10, ex 7
    public int printSumOfNumbers(int number){
        int sum = 0;
        for (int i=number; i<=100; i++){
            sum += i;
        }
        return sum;
    }

    // Lab 10, ex 8
    public float printAverageOfNumbers(int n){
        int sum = 0;
        for (int i=n; i<=100; i++){
            sum +=i;
        }
        return (float) sum/100;
    }

    // Lab 10, ex 9
    public void printStars(int x){
        for (int i=x; i>=1; i--){    // number of rows, decreases i after each row reducing the number of stars
            for (int j=1; j<=i; j++){    // print stars in each row
                System.out.print("*");
            }
            //Move to the next line after finishing one row
            System.out.println();
        }
    }

    // Java While Loops
    // Lab 10, ex1
    public void printFromNumberTo100(int x){
        while (x <= 100){
            System.out.println(x);
            x++;
        }
    }

    // Lab 10, ex2
    public void printNumbersToMinus100(int x){
        while (x >= -100){
            System.out.println(x);
            x--;
        }
    }

    // Lab 10, ex3
    public void printCountBetweenTwoNumbers2(int first, int second){
        while (first <= second){
            System.out.println(first);
            first++;
        }
        while (first >= second){
            System.out.println(first);
            first--;
        }
    }

    // Lab 10, ex4
    public void printCountBetweenTwoNumbers3(int number1, int number2){
        int x = Math.min(number1, number2);
        int y = Math.max(number1, number2);
        int i = x;
        while (i <= y){
            System.out.println(i);
            i++;
        }
    }

    // Lab 10, ex 5
    public void printEvenNumbers2(){
        int i = 0;
        while (i <= 100){
            i++;
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    // Lab 10, ex 6
    public void printOddNumbers2(){
        int i = 0;
        while(i < 100){
            i++;
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    // Lab 10, ex 7
    public void printAvgFromNumberToNumber(int x, int y){
        float sum = 0;
        int count  = 0;
        while (x <= y){
            sum = sum + x;
            x++;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }

    // Lab 10, ex 8
    public float printAvgNumbersFromInterval(int x, int y){
        float sum = 0;
        int count = 0;
        while (x <= y){
            if (x % 7 == 0) {
                sum = sum + x;
            }
            x++;
            count++;
        }
        return (sum/count);
    }

    // Lab 10, ex 9
    public void printFibonacciNumbers(int x){
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second); // primele 2 numere
        int count = 3; // counterul incepe de la 3 deoarece am printat deja primele 2 mai sus
        while (count <= x){
            int next = first + second; // urmatorul nr din sirul lui Fibonacci
            System.out.println(next);
            first = second;
            second = next;
            count++;
        }
    }

    // Lab 10, ex 10
    public void printCozaLozaWoza(){
        int x = 1;
        while (x <= 110){
            if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0) {
                System.out.print("CozaLozaWoza" + "\t");
            } else if (x % 5 == 0 && x % 7 == 0) {
                System.out.print("WozaLoza" + "\t");
            } else if (x % 3 == 0 && x % 7 == 0) {
                System.out.print("CozaWoza" + "\t");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.print("CozaLoza" + "\t");
            } else if (x % 7 == 0) {
                System.out.print("Woza" + "\t");
            } else if (x % 5 == 0) {
                System.out.print("Loza" + "\t");
            } else if (x % 3 == 0) {
                System.out.print("Coza" + "\t");
            } else {
                System.out.print(x + "\t");
            }
            if (x % 11 == 0) {
                System.out.println();
            }
            x++;
        }
    }

    // Lab 11 (Java Arrays), ex 2
    public void getArrayTo100() {
        int[] myIntArray = new int[100];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i + 1;
            System.out.println(myIntArray[i]);
        }
    }

    // Lab 11 (Java Arrays), ex 3
    public int[] getEvenArrayTo100(int[] arr){
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }

    // Lab 11 (Java Arrays), ex 4
    public float getAverageMyArray(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        return (sum / myArray.length);
    }

    // Lab 11 (Java Arrays), ex 5
    public boolean getMyStringArray(String[] myStringArray, String input){
        for(int i = 0; i < myStringArray.length; i++){
            if (myStringArray[i].equals(input)) {
                return true;
            }
        }
        return false;
    }

    // Lab 11 (Java Arrays), ex 6
    public int getNumberPositionInArray(int[] myArray, int x){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == x){
                return i;
            }
        }
        return 0;
    }

    // Lab 11 (Java Arrays), ex 7
    public void printLinesPattern() {
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};
        for (int i = 0; i <= 10; i++) {
            System.out.println(line);
        }
    }

    // Lab 11 (Java Arrays), ex 8
    public int[] deleteNumberFromArray(int[] myArray, int x){
        // count elements not matching with x
        int size = 0;
        for(int i =0; i < myArray.length; i++){
            if(myArray[i] != x){
                size ++;
            }
        }
        // create a new array and copy elements one bye one except x
        int[] newArray = new int[size];
        int index = 0;
        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] != x) {
                newArray[index] = myArray[i];
                index ++;
            }
        }
        return newArray;
    }

    // Lab 11 (Java Arrays), ex 9
    public int[] getSecondSmallesNumber(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            for(int j = i + 1; j < myArray.length; j++){
                if(myArray[i] > myArray[j]){
                    int temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
        }
        return new int[]{myArray[1]};
    }

    // Lab 11 (Java Arrays), ex 10
    public int[] copyArrayFromOneToAnother(int[] firstArray, int[] newArray) {
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            newArray[j] = firstArray[i];
            j++;
        }
        return newArray;
    }

    // Lab 11 - Tema optionala - Java Arrays
    // 1. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
    public int [] insertOnPositionInArray(int[] myArray, int element, int position){
        if (position < 0 || position > myArray.length){
            System.out.println("Invalid position!");
        }
        int[] newArray = new int[myArray.length + 1];
        // copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = myArray[i];
        }
        // insert new element
        newArray[position] = element;
        // copy the remaining elements
        for (int i = position; i < myArray.length; i++){
            newArray[i+1] = myArray[i];
        }
        return newArray;
    }

    // 2. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.
    public int[] getMinMax(int[] myArray){
        int min = myArray[0];
        int max = myArray[0];
        for(int i = 1; i < myArray.length; i++){
            if (myArray[i] < min){
                min = myArray[i];
            }
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        return new int[]{min, max};
    }

    // 3. Creati o metoda care sa inverseze valorile unui array de int-uri.
    public void invertValuesInArray(int[] myArray){
        int start = 0;
        int end = myArray.length-1;
        while (start < end){
            // invert myArray start and myArray end
            int temp = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = temp;
            start ++;
            end --;
        }
    }

    // 4. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
    public void findDuplicates(int[] myArray){
        boolean hasDuplicates = false;
        for (int i = 0; i < myArray.length; i++){
            // check if element was already counted
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++){
                if (myArray[i] == myArray[j]){
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted){
                continue;  // skip it if already counted
            }
            // count occurrences in the rest of array
            int count = 0;
            for (int k = i + 1; k < myArray.length; k++){
                if(myArray[i] == myArray[k]){
                    count++;
                }
            }
            // if duplicates exists, print the number
            if (count > 0){
                System.out.print(myArray[i] + " ");
                hasDuplicates = true;
            }
        }
        // handle case for no duplicates
        if (!hasDuplicates){
            System.out.print("No duplicates");
        }
        System.out.println();
    }

    //5. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).
    public void findCommonElements(String[] arr1, String[] arr2){
        boolean found = false;
        for (int i = 0; i < arr1.length; i ++){
            // check if the element exists in arr2
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i].equals(arr2[j])){
                    boolean alreadyPrinted = false;
                    // make sure duplicates are not printed from arr1
                    for (int k = 0; k < i; k++){
                        if(arr1[i].equals(arr1[k])){
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    // if a common element was found and hasn't been printed yet, print it
                    if (!alreadyPrinted){
                        System.out.print(arr1[i] + " ");
                        found  = true;
                    }
                    break; // stop checking arr2 once match was found
                }
            }
            if (!found) {
                System.out.print("No common elements found");
            }
        }
        System.out.println();
    }

    // 6. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.
    public int[] sortMyArray(int[] myArray){
        int n = myArray.length;
        // Bubble sort
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 - i; j++){
                if (myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        return myArray;   // sorted array
    }

    // Lab 12 - Lists
    // 1. Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void printParamsFromList(List<Integer> myList){
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + "\n");
        }
    }

    // 2. Scrieti o metoda Java, care sa primeasca doi parametri: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addNumberToList(List<Integer> myList, int myNumber){
        myList.add(myNumber);
        System.out.println(myList);
    }

    // 3. Scrieti o metoda Java, care sa primeasca doi parametri: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul
    // intreg primit ca si parametru.

    public void printMyList(List<Integer> myList, int myNumber){
        // find the index of myNumber (start number)
        int index = myList.indexOf(myNumber);
        if (index == -1){
            System.out.println("Introduced number is not found in the list. Please provide a number that is in the list!");
            return;
        }
        for (int i = index; i < myList.size(); i++) {
                System.out.print(myList.get(i) + "\n");
            }
    }

    // 4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
    // dar invers(de la capat la inceput).

    public void printReversedList(List<Integer> myList){
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.reversed().get(i) + " ");
        }
    }

    // 5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,
    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg
    // reprezinta pozitia la care sa fie pus acel String.

    public void addStringToList(List<String> myList, int stringPosition, String myString){
        if (stringPosition >= 0 && stringPosition <= myList.size()) {
            myList.add(stringPosition, myString);
            System.out.println(myList);
        }
        else {
            System.out.println("Invalid index!");
        }
    }

    // 6. Scrieti o metoda Java, care sa primeasca doi parametri.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public List<String> getMyList(List<String> myList, String myString){
        myList.addFirst(myString);
        return myList;
    }

    // 7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.
    // (Ex: “Pe pozitia 1 valoare este 4”).

    public void printMyList(List<String> myList){
        for (int i = 0; i < myList.size(); i++){
            System.out.println("Pe pozitia " + i + " se afla valoarea " + myList.get(i));
        }
    }

    // 8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public int getMax(List<Integer> myList){
        int max = myList.get(0);
        for (int i = 1; i < myList.size(); i++){
            int current = myList.get(i);
            if (current > max){
                max = current;
            }
        }
        return max;
    }

    // Lab 12 - Tema optionala Lists
    // 1. Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista
    public void swapElements(List<String> myList, int index1, int index2){
        if (index1 >= 0 && index1 < myList.size() && index2 >= 0 && index2 < myList.size()){
            String temp = myList.get(index1);
            myList.set(index1, myList.get(index2));
            myList.set(index2, temp);
            System.out.println("Swapped elements list: " + myList);
        }
        else {
            System.out.println("Invalid indexes!");
        }
    }

    // 2. Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista, care sa contina doar numerele
    // pare din lista primita.

    public List<Integer> getEvenNumbers(List<Integer> myList){
        // create the new list that stores the even numbers
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i) % 2 == 0){
                evens.add(myList.get(i));
            }
        }
        return evens;
    }

    // 3. Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator.
    // Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi), si nu folosit librarie externa,
    // precum Collection.sort().
    public List<Integer> getSortedList(List<Integer> myList){
        // copy of original list
        List<Integer> sortedList = new ArrayList<>(myList);
        int n  = sortedList.size();
        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (sortedList.get(j) > sortedList.get(j + 1)){
                    // Swap values
                    int temp =  sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }
        return sortedList;
    }
}
