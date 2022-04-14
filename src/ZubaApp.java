
    import java.util.Random;
import java.util.Scanner;

    public class ZubaApp {
        public static void main(String[] args) {
            Random number = new Random();
            Scanner input = new Scanner(System.in);

            String operator = "";
            int userInput = collectUserInput(number);
            int correctAnswers = 0;
            int wrongAnswers = 0;
            int counter = 1;

            while (counter <= 10) {
                int firstNumber = 1+number.nextInt(10);
                int secondNumber = 1+number.nextInt(10);

                Random operatorSelection = new Random();
                switch (operatorSelection.nextInt(4)) {
                    case 0:
                        operator = "+";
                        userInput = firstNumber + secondNumber;
                        break;

                    case 1:
                        operator = "-";
                        userInput = firstNumber - secondNumber;
                        break;

                    case 2:
                        operator = "/";
                        userInput = firstNumber / secondNumber;
                        break;

                    case 3:
                        operator = "*";
                        userInput = firstNumber * secondNumber;
                        break;

//                    case 4:
//                        operator = "%";
//                        userInput = firstNumber % secondNumber;
//                        break;

                }

                System.out.printf(" %d %s %d =  ", firstNumber, operator, secondNumber);
                int result = input.nextInt();

                if (result == userInput) {
                    correctAnswers++;
                } else {
                    wrongAnswers++;
                }

                counter++;
            }

            int overallResult = correctAnswers - wrongAnswers;
            System.out.println("You scored " + overallResult + " out of 10");
            System.out.println("correctAnswers" + " " + correctAnswers);
            System.out.println("wrongAnswer" + " " + wrongAnswers);
            if (correctAnswers >= 8)
            System.out.println("passed");
            else
               System.out.println("failed");
        }

        private static int collectUserInput(Random number) {
            return 0;
        }
    }

