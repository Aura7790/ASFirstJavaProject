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
}
