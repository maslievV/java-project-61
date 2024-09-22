package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final char[] OPERATORS = new char[]{'+', '-', '*'};
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static void start() {
        String[][] generated = new String[Engine.NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            generated[i] = generateRoundData();
        }
        Engine.run(generated, DESCRIPTION);
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

        int firstNum = Utils.makeRandomNumber();
        int secondNum = Utils.makeRandomNumber();
        int operator = Utils.makeRandomNumber(OPERATORS.length);

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
            case 2:
                result = num1 * num2;
                break;
            default:
                throw new IllegalStateException("Unexpected value " + operation);
        }
        return Integer.toString(result);
    }

    public static String makeQuestion(int operation, int num1, int num2) {
        String question;
        switch (operation) {
            case 0:
                question = "%d %c %d".formatted(num1, OPERATORS[0], num2);
                break;
            case 1:
                question = "%d %c %d".formatted(num1, OPERATORS[1], num2);
                break;
            case 2:
                question = "%d %c %d".formatted(num1, OPERATORS[2], num2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return question;
    }
}
