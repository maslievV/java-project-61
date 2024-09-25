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

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];

        int firstNum = Utils.makeRandomNumber();
        int secondNum = Utils.makeRandomNumber();
        int operator = Utils.makeRandomNumber(OPERATORS.length);

        gameData[Engine.QUESTION_NUMBER] = makeQuestion(operator, firstNum, secondNum);
        gameData[Engine.ANSWER_NUMBER] = Integer.toString(calculateResult(operator, firstNum, secondNum));

        return gameData;
    }

    public static int calculateResult(int operation, int num1, int num2)  {
        return switch (operation) {
            case 0 -> num1 + num2;
            case 1 -> num1 - num2;
            case 2 -> num1 * num2;
            default -> throw new IllegalStateException("Unexpected value " + operation);
        };
    }

    public static String makeQuestion(int operation, int num1, int num2) {
        return "%d %c %d".formatted(num1, OPERATORS[operation], num2);
    }
}
