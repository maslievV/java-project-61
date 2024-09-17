package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {

    public static final int NUMBER_RANGE = 100;

    public static void startPrime() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            questionsAndAnswers[i] = generateRoundData();
        }
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.run(questionsAndAnswers);
    }

    public static String[] generateRoundData() {
        String[] gameData = new String[Engine.ELEMENTS_COUNT];
        int primeNUmber = Utils.makeRandomNumber(NUMBER_RANGE);

        gameData[Engine.QUESTION_NUMBER] = Integer.toString(primeNUmber);
        gameData[Engine.ANSWER_NUMBER] = checkPrime(primeNUmber);

        return gameData;
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
