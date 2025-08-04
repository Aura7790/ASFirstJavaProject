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
    public String snowInWinter(int numberInput){
        if (numberInput > 8 || numberInput == 6) {
            return "The amount of snow this winter was(cm): " + numberInput;
        }
        else {
            return "The forecast snow is(cm):" + numberInput;
        }
    }

    // Lab 9, exercitiul 7
    public String numberComparison(int numberInput){
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
    public String numberSwitch(int numberInput){
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
    public String highestNumber (int firstInput, int secondInput, int thirdInput){
        if (firstInput > secondInput && firstInput > thirdInput){
            // System.out.println("Highest number is firstInput: " + firstInput);
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
}
