package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void evenGame() {

        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] userQuestions = new String[Engine.NUMBER_OF_QUESTIONS];

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int random = Utils.makeRandomNumber(Engine.NUMBER_OF_QUESTIONS);

            userQuestions[i] = String.valueOf(random);
            correctAnswers[i] = checkEven(random);
        }
        Engine.run(userQuestions, correctAnswers, description);
    }

    public static String checkEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
}
