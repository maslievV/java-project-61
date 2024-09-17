package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void startEven() {

        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] userQuestions = new String[Engine.NUMBER_OF_QUESTIONS];

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int randomNum = Utils.makeRandomNumber(Engine.NUMBER_OF_QUESTIONS);

            userQuestions[i] = String.valueOf(randomNum);
            correctAnswers[i] = checkEven(randomNum);
        }
        Engine.run(userQuestions, correctAnswers, description);
    }

    public static String checkEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
}
