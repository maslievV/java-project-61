package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int ARRAY_LENGTH = 10;
    private static final int MAX_STEP = 10;

    public static void progressionGame() {

        String[] questionsToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        String description = "What number is missing in the progression? ";

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int beginning = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
            int step = Utils.makeRandomNumber(MAX_STEP);
            String[] numbers = generateProgression(beginning, step, ARRAY_LENGTH);

            int randomIndex = Utils.makeRandomNumber(numbers.length);
            String missedNumber = numbers[randomIndex];
            numbers[randomIndex] = "..";

            questionsToUser[i] = String.join(" ", numbers);
            correctAnswers[i] = missedNumber;
        }
        Engine.run(questionsToUser, correctAnswers, description);

    }

    public static String[] generateProgression(int start, int n, int arrayLength) {

        String[] arrayNum = new String[arrayLength];
        arrayNum[0] = String.valueOf(start);

        for (int i = 1; i < arrayLength; i++) {
            arrayNum[i] = String.valueOf(start + n);
            start = start + n;
        }
        return arrayNum;
    }


}

