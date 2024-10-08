package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int ARRAY_LENGTH = 10;
    public static final int MAX_STEP = 10;
    public static final String DESCRIPTION = "What number is missing in the progression? ";

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];
        int beginning = Utils.makeRandomNumber();
        int step = Utils.makeRandomNumber(MAX_STEP);
        String[] numbers = generateProgression(beginning, step, ARRAY_LENGTH);

        int randomIndex = Utils.makeRandomNumber(numbers.length);
        String missedNumber = numbers[randomIndex];
        numbers[randomIndex] = "..";

        gameData[Engine.QUESTION_NUMBER] = String.join(" ", numbers);
        gameData[Engine.ANSWER_NUMBER] = missedNumber;

        return gameData;
    }

    public static String[] generateProgression(int firstNumber, int progressionStep, int arrayLength) {
        String[] arrayNum = new String[arrayLength];
        arrayNum[0] = String.valueOf(firstNumber);

        for (int i = 1; i < arrayLength; i++) {
            arrayNum[i] = String.valueOf(firstNumber + progressionStep);
            firstNumber += progressionStep;
        }
        return arrayNum;
    }


}

