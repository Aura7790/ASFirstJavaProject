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
    }
}
