package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];
        int firstNum = Utils.makeRandomNumber();
        int secondNum = Utils.makeRandomNumber();

        gameData[Engine.QUESTION_NUMBER] = String.format("%s %s", firstNum, secondNum);
        gameData[Engine.ANSWER_NUMBER] = Integer.toString(calculateGCD(firstNum, secondNum));

        return gameData;
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
