package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];
        int randomNum = Utils.makeRandomNumber();
        gameData[Engine.QUESTION_NUMBER] = Integer.toString(randomNum);
        gameData[Engine.ANSWER_NUMBER] = isEven(randomNum) ? "yes" : "no";

        return gameData;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
