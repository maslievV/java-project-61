package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {

    private static final int NUMBER_RANGE = 100;

    public static void primeGame() {
        String[] questionsToUser = new String[Engine.NUMBER_OF_QUESTIONS];
        String[] correctAnswers = new String[Engine.NUMBER_OF_QUESTIONS];

        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int primeNUmber = Utils.makeRandomNumber(NUMBER_RANGE);

            questionsToUser[i] = String.valueOf(primeNUmber);
            correctAnswers[i] = checkPrime(primeNUmber);
        }
        Engine.run(questionsToUser, correctAnswers, description);
    }

    public static String checkPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return (count == 2) ? "yes" : "no";
    }

}
