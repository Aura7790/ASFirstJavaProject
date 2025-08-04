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
        String snow1 = op.snowInWinter(6);
        System.out.println(snow1);
        String snow2 = op.snowInWinter(10);
        System.out.println(snow2);
        String snow3 = op.snowInWinter(8);
        System.out.println(snow3);
        String snow4 = op.snowInWinter(3);
        System.out.println(snow4);

        // Lab 9, exercitiul 7
        String num1 = op.numberComparison(7);
        System.out.println(num1);
        String num2 = op.numberComparison(4);
        System.out.println(num2);
        String num3 = op.numberComparison(2);
        System.out.println(num3);

        // Lab 9, exercitiul 8
        System.out.println(op.numberSwitch(1));
        System.out.println(op.numberSwitch(5));
        System.out.println(op.numberSwitch(7));

        // Lab 9, exercitiul 9
        System.out.println(op.isNumberEven(5));
        System.out.println(op.isNumberEven(10));

        // Lab 9, exercitiul 10
        System.out.println(op.isEligibleToVote(18));
        System.out.println(op.isEligibleToVote(10));
        System.out.println(op.isEligibleToVote(22));

        // Lab 9, exercitiul 11
        System.out.println(op.highestNumber(7, 11, 99));
        System.out.println(op.highestNumber(22, 13, -5));
        System.out.println(op.highestNumber(11, 11, 11));
    }
}
