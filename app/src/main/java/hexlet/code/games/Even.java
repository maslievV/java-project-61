package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {

    public static void evenGame() {

        String[] correctAnswers = new String[Engine.getNUMBEROFQUESTIONS()];
        String[] userQuestions = new String[Engine.getNUMBEROFQUESTIONS()];

        for (int i = 0; i < Engine.getNUMBEROFQUESTIONS(); i++) {
            int random = Engine.makeRandomNumber(100);
            userQuestions[i] = String.valueOf(random);
            correctAnswers[i] = checkEven(random);
        }

        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.gameEngine(userQuestions, correctAnswers);
    }

    public static String checkEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
}
