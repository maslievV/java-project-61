package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Util;


public class Prime {

    private static final int NUMBERRANGE = 100;

    public static void primeGame() {
        String[] questionsToUser = new String[Engine.getNUMBEROFQUESTIONS()];
        String[] correctAnswers = new String[Engine.getNUMBEROFQUESTIONS()];

        Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < Engine.getNUMBEROFQUESTIONS(); i++) {
            int primeNUmber = Util.makeRandomNumber(NUMBERRANGE);

            questionsToUser[i] = String.valueOf(primeNUmber);
            correctAnswers[i] = checkPrime(primeNUmber);
        }
        Engine.gameEngine(questionsToUser, correctAnswers);
    }

    public static String checkPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return (count == 2) ? "yes" : "no";
    }

}
