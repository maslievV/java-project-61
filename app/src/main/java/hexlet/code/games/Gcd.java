package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    public static void startGCD() {

        String[] questionsToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        String description = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int firstNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
            int secondNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);

            questionsToUser[i] = String.format("%s %s", firstNum, secondNum);
            correctAnswers[i] = String.valueOf(calculateGCD(firstNum, secondNum));

        }
        Engine.run(questionsToUser, correctAnswers, description);
    }

    public static int calculateGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1 + num2;
    }

}
