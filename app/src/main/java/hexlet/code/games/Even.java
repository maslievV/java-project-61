package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void startEven() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.run(questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];
        int randomNum = Utils.makeRandomNumber(Engine.RANDOM_SIZE);
        gameData[Engine.QUESTION_NUMBER] = Integer.toString(randomNum);
        gameData[Engine.ANSWER_NUMBER] = checkEven(randomNum);

        return gameData;
    }

    public static String checkEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
}
