package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_OPERATOR = 3;

    public static void startCalc() {
        String[] userQuestions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        String description = "What is the result of the expression?";

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int firstNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
            int secondNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
            int operator = Utils.makeRandomNumber(MAX_OPERATOR);

            userQuestions[i] = makeQuestion(operator, firstNum, secondNum);
            correctAnswers[i] = calculateResult(operator, firstNum, secondNum);
        }
        Engine.run(userQuestions, correctAnswers, description);
    }

    public static String calculateResult(int operation, int num1, int num2)  {
        int result;
        switch(operation) {
            case 0:
                result = num1 + num2;
                break;
            case 1:
                result = num1 - num2;
                break;
            default:
                result = num1 * num2;
        }
        return Integer.toString(result);
    }

    public static String makeQuestion(int operation, int num1, int num2) {
        String question;
        switch (operation) {
            case 0:
                question = String.valueOf(num1 + " + " + num2);
                break;
            case 1:
                question = String.valueOf(num1 + " - " + num2);
                break;
            default:
                question = String.valueOf(num1 + " * " + num2);
        }
        return question;
    }
}
