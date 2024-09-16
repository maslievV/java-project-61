package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_OPERATOR = 3;

    public static void calcGame() {
        String[] userQuestions = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        String description = "What is the result of the expression?";

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int firstNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
            int secondNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
            int operator = Utils.makeRandomNumber(MAX_OPERATOR);

            switch (operator) {
                case 0:
                    userQuestions[i] = String.valueOf(firstNum + " + " + secondNum);
                    correctAnswers[i] = String.valueOf(firstNum + secondNum);
                    break;
                case 1:
                    userQuestions[i] = String.valueOf(firstNum + " - " + secondNum);
                    correctAnswers[i] = String.valueOf(firstNum - secondNum);
                    break;
                default:
                    userQuestions[i] = String.valueOf(firstNum + " * " + secondNum);
                    correctAnswers[i] = String.valueOf(firstNum * secondNum);
            }

        }
        Engine.run(userQuestions, correctAnswers, description);
    }
}
