package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    public static void startGCD() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.run(questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];
        int firstNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
        int secondNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);

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
