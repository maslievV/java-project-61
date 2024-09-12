package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Cli;

public class Calc {
    private static final int MAXOPERATOR = 3;

    public static void calcGame() {
        String[] userQuestions = new String[Engine.getNUMBEROFQUESTIONS()];
        String[] correctAnswers = new String[Engine.getNUMBEROFQUESTIONS()];

        Cli.greeting();
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.getNUMBEROFQUESTIONS(); i++) {
            int firstNum = Engine.makeRandomNumber(Engine.getRandomsize());
            int secondNum = Engine.makeRandomNumber(Engine.getRandomsize());
            int operator = Engine.makeRandomNumber(MAXOPERATOR);

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
        Engine.gameEngine(userQuestions, correctAnswers);

    }
}
