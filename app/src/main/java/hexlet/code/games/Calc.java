package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;
import hexlet.code.Cli;

public class Calc {
    public static void calcGame() {
        String[] userQuestions = new String[Engine.getNUMBEROFQUESTIONS()];
        String[] correctAnswers = new String[Engine.getNUMBEROFQUESTIONS()];

        Cli.greeting();

        for (int i = 0; i < Engine.getNUMBEROFQUESTIONS(); i++) {
            int firstNum = Util.makeRandomNumber(100), secondNum = Util.makeRandomNumber(100), operator = Util.makeRandomNumber(3);
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
