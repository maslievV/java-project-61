package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int MAX_OPERATOR = 3;
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static void startCalc() {
        Engine.run(generateQuestions(), DESCRIPTION);
    }

    public static String[][] generateQuestions() {
        String[][] generated = new String[Engine.NUMBER_OF_QUESTIONS][];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            generated[i] = generateRoundData();
        }

        return generated;
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];

        int firstNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
        int secondNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
        int operator = Utils.makeRandomNumber(MAX_OPERATOR);

        gameData[Engine.QUESTION_NUMBER] = makeQuestion(operator, firstNum, secondNum);
        gameData[Engine.ANSWER_NUMBER] = calculateResult(operator, firstNum, secondNum);

        return gameData;
    }

    public static String calculateResult(int operation, int num1, int num2)  {
        int result;
        switch (operation) {
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
